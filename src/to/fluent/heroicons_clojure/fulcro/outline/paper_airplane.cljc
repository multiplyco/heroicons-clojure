(ns to.fluent.heroicons-clojure.fulcro.outline.paper-airplane
  (:refer-clojure :exclude [paper-airplane]))

(def paper-airplane (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M12 19l9 2-9-18-9 18 9-2zm0 0v-8"})))

(def paper-airplane-icon paper-airplane)