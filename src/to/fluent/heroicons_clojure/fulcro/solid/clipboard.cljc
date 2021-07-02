(ns to.fluent.heroicons-clojure.fulcro.solid.clipboard
  (:refer-clojure :exclude [clipboard]))

(def clipboard (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :viewBox "0 0 20 20", :fill "currentColor"} (com.fulcrologic.fulcro.dom/path {:d "M8 3a1 1 0 011-1h2a1 1 0 110 2H9a1 1 0 01-1-1z"}) (com.fulcrologic.fulcro.dom/path {:d "M6 3a2 2 0 00-2 2v11a2 2 0 002 2h8a2 2 0 002-2V5a2 2 0 00-2-2 3 3 0 01-3 3H9a3 3 0 01-3-3z"})))

(def clipboard-icon clipboard)