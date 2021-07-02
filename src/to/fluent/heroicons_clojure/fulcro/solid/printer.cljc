(ns to.fluent.heroicons-clojure.fulcro.solid.printer
  (:refer-clojure :exclude [printer]))

(def printer (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :viewBox "0 0 20 20", :fill "currentColor"} (com.fulcrologic.fulcro.dom/path {:fillRule "evenodd", :d "M5 4v3H4a2 2 0 00-2 2v3a2 2 0 002 2h1v2a2 2 0 002 2h6a2 2 0 002-2v-2h1a2 2 0 002-2V9a2 2 0 00-2-2h-1V4a2 2 0 00-2-2H7a2 2 0 00-2 2zm8 0H7v3h6V4zm0 8H7v4h6v-4z", :clipRule "evenodd"})))

(def printer-icon printer)