(ns to.fluent.heroicons-clojure.fulcro.solid.flag
  (:refer-clojure :exclude [flag]))

(def flag (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :viewBox "0 0 20 20", :fill "currentColor"} (com.fulcrologic.fulcro.dom/path {:fillRule "evenodd", :d "M3 6a3 3 0 013-3h10a1 1 0 01.8 1.6L14.25 8l2.55 3.4A1 1 0 0116 13H6a1 1 0 00-1 1v3a1 1 0 11-2 0V6z", :clipRule "evenodd"})))

(def flag-icon flag)