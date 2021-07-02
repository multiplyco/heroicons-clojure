(ns to.fluent.heroicons-clojure.fulcro.solid.chart-pie
  (:refer-clojure :exclude [chart-pie]))

(def chart-pie (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :viewBox "0 0 20 20", :fill "currentColor"} (com.fulcrologic.fulcro.dom/path {:d "M2 10a8 8 0 018-8v8h8a8 8 0 11-16 0z"}) (com.fulcrologic.fulcro.dom/path {:d "M12 2.252A8.014 8.014 0 0117.748 8H12V2.252z"})))

(def chart-pie-icon chart-pie)