(ns to.fluent.heroicons-clojure.fulcro.solid.credit-card
  (:refer-clojure :exclude [credit-card]))

(def credit-card (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :viewBox "0 0 20 20", :fill "currentColor"} (com.fulcrologic.fulcro.dom/path {:d "M4 4a2 2 0 00-2 2v1h16V6a2 2 0 00-2-2H4z"}) (com.fulcrologic.fulcro.dom/path {:fillRule "evenodd", :d "M18 9H2v5a2 2 0 002 2h12a2 2 0 002-2V9zM4 13a1 1 0 011-1h1a1 1 0 110 2H5a1 1 0 01-1-1zm5-1a1 1 0 100 2h1a1 1 0 100-2H9z", :clipRule "evenodd"})))

(def credit-card-icon credit-card)