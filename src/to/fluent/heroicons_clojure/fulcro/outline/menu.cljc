(ns to.fluent.heroicons-clojure.fulcro.outline.menu
  (:refer-clojure :exclude [menu]))

(def menu (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M4 6h16M4 12h16M4 18h16"})))

(def menu-icon menu)