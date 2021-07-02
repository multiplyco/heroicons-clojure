(ns to.fluent.heroicons-clojure.fulcro.solid.bookmark
  (:refer-clojure :exclude [bookmark]))

(def bookmark (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :viewBox "0 0 20 20", :fill "currentColor"} (com.fulcrologic.fulcro.dom/path {:d "M5 4a2 2 0 012-2h6a2 2 0 012 2v14l-5-2.5L5 18V4z"})))

(def bookmark-icon bookmark)