#!/usr/bin/env bb

;; Requires
;; ##################################
(require '[clojure.string :as str])
(require '[clojure.java.io :as io])
(require '[babashka.pods :as pods])
(require '[clojure.pprint :as pprint])


;; Pods
;; ##################################
(pods/load-pod 'retrogradeorbit/bootleg "0.1.9")

;; Pod requires
;; ##################################
(require '[pod.retrogradeorbit.bootleg.utils :as bootleg-utils])

;; Icons
;; ##################################
(defn file->file-name-parts
  [a-file]
  (str/split (.getName a-file) #"\."))


(defn file->file-ext
  [a-file]
  (last (file->file-name-parts a-file)))


(defn svg?
  [a-file]
  (and (.isFile a-file)
       (= "svg" (file->file-ext a-file))))


(def outline-icons (->> (io/file "heroicons/optimized/outline")
                       file-seq
                       (filter svg?)))

(def solid-icons (->> (io/file "heroicons/optimized/solid")
                     file-seq
                     (filter svg?)))


;; Helpers
;; ##################################
(defn is-blank?
  [entry]
  (and (string? entry)
       (str/blank? entry)))


(defn html->hiccup
  [html]
  (->> (-> html
           (str/replace #"(\n|\s)+" " ")
           (str/trim))
       bootleg-utils/html->hiccup
       (remove is-blank?)
       vec))


(defn file->file-name [a-file]
  (first (file->file-name-parts a-file)))


;; Core
;; ##################################
(defn svg-hiccup->def-str
  [icon-name svg-hiccup]
  (str "(def " icon-name " " svg-hiccup ")"))


(defn snakeify
  [a-str]
  (str/replace a-str "-" "_"))

(defn transform-keyword
  [k]
  (symbol (str "com.fulcrologic.fulcro.dom/" (name k))))


(def keyword-conversions
  {:stroke :stroke
   :xmlns :xmlns
   :fill :fill
   :d :d
   :viewbox :viewBox
   :fill-rule :fillRule
   :clip-rule :clipRule
   :stroke-linecap :strokeLinecap
   :stroke-linejoin :strokeLinejoin
   :stroke-width :strokeWidth})

(defn transform-args
  [args]
  (reduce-kv
   (fn [m k v]
     (let [new-k (or (get keyword-conversions k)
                     (throw (Exception. (str "No conversion rule for " k))))]
       (assoc m new-k v)))
   {}
   args))


;; Reagent
;; ##################################
(defn reactify
  [svg-hiccup]
  (condp #(%1 %2) svg-hiccup
    keyword? svg-hiccup
    map? (transform-args svg-hiccup)
    vector? (mapv reactify svg-hiccup)
    (throw (Exception. (str "Unknown token: " svg-hiccup)))))


(defn make-reagent-icon
  [ns-name a-file]
  (let [file-name (file->file-name a-file)
        icon-def-str (svg-hiccup->def-str file-name (-> a-file slurp html->hiccup reactify))
        file-content (str "(ns to.fluent.heroicons-clojure.reagent." ns-name "." file-name "\n"
                          "  (:refer-clojure :exclude [" file-name "]))"
                          "\n\n"
                          icon-def-str
                          "\n\n"
                          "(def " file-name "-icon " file-name ")")
        file-name* (snakeify file-name)
        file-path (str "src/to/fluent/heroicons_clojure/reagent/" (snakeify ns-name))]
    (.mkdirs (io/file file-path))
    (spit (str file-path "/" file-name* ".cljc") file-content)))


;; Fulcro
;; ##################################
(defn fulcroify
  [svg-hiccup]
  (condp #(%1 %2) svg-hiccup
    keyword? (transform-keyword svg-hiccup)
    map? (transform-args svg-hiccup)
    vector? (apply list (map fulcroify svg-hiccup))
    (throw (Exception. (str "Unknown token: " svg-hiccup)))))


(defn make-fulcro-icon
  [ns-name a-file]
  (let [file-name (file->file-name a-file)
        icon-def-str (svg-hiccup->def-str file-name (-> a-file slurp html->hiccup fulcroify))
        file-content (str "(ns to.fluent.heroicons-clojure.fulcro." ns-name "." file-name "\n"
                          "  (:refer-clojure :exclude [" file-name "]))"
                      "\n\n"
                      icon-def-str
                      "\n\n"
                      "(def " file-name "-icon " file-name ")")
        file-name* (snakeify file-name)
        file-path (str "src/to/fluent/heroicons_clojure/fulcro/" (snakeify ns-name))]
    (.mkdirs (io/file file-path))
    (spit (str file-path "/" file-name* ".cljc") file-content)))


;; Generate solid icons
;; ##################################
(doseq [solid-icon solid-icons]
  (println "Processing solid" (file->file-name solid-icon))
  (make-reagent-icon "solid" solid-icon)
  (make-fulcro-icon "solid" solid-icon))


;; Generate outline icons
;; ##################################
(doseq [outline-icon outline-icons]
  (println "Processing outline" (file->file-name outline-icon))
  (make-reagent-icon "outline" outline-icon)
  (make-fulcro-icon "outline" outline-icon))
