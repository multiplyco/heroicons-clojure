(ns to.fluent.heroicons-clojure.fulcro.outline.clock
  (:refer-clojure :exclude [clock]))

(def clock (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M12 8v4l3 3m6-3a9 9 0 11-18 0 9 9 0 0118 0z"})))

(def clock-icon clock)