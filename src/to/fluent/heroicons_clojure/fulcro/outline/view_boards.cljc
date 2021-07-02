(ns to.fluent.heroicons-clojure.fulcro.outline.view-boards
  (:refer-clojure :exclude [view-boards]))

(def view-boards (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M9 17V7m0 10a2 2 0 01-2 2H5a2 2 0 01-2-2V7a2 2 0 012-2h2a2 2 0 012 2m0 10a2 2 0 002 2h2a2 2 0 002-2M9 7a2 2 0 012-2h2a2 2 0 012 2m0 10V7m0 10a2 2 0 002 2h2a2 2 0 002-2V7a2 2 0 00-2-2h-2a2 2 0 00-2 2"})))

(def view-boards-icon view-boards)