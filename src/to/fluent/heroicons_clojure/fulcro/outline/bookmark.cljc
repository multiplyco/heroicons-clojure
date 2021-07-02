(ns to.fluent.heroicons-clojure.fulcro.outline.bookmark
  (:refer-clojure :exclude [bookmark]))

(def bookmark (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M5 5a2 2 0 012-2h10a2 2 0 012 2v16l-7-3.5L5 21V5z"})))

(def bookmark-icon bookmark)