# heroicons-clojure

Converts the full [heroicons](https://heroicons.com) set for easy use from Clojure and ClojureScript as `.cljc` files.

Currently we include Hiccup (for Reagent et. al.) and Fulcro definitions.

## Coordinates

[![Clojars Project](https://img.shields.io/clojars/v/to.fluent/heroicons-clojure.svg)](https://clojars.org/to.fluent/heroicons-clojure)

```
to.fluent/heroicons-clojure {:mvn/version "1.0.1-1"}
```

## Usage

For `medium`/`outline` icons, the icon is available at

```clojure
;; Fulcro
to.fluent.heroicons-clojure.fulcro.outline.{icon-name}/{icon-name}

;; Reagent
to.fluent.heroicons-clojure.reagent.outline.{icon-name}/{icon-name}
```

For `small`/`solid` icons, the icon is available at

```clojure
;; Fulcro
to.fluent.heroicons-clojure.fulcro.solid.{icon-name}/{icon-name}

;; Reagent
to.fluent.heroicons-clojure.reagent.solid.{icon-name}/{icon-name}
```

## Example with wrapper
Using [Tailwind CSS](https://tailwindcss.com) classes.

For [Fulcro](https://github.com/fulcrologic/fulcro),

```clojure
(ns my-file
  (:require [to.fluent.heroicons-clojure.fulcro.outline.academic-cap :refer [academic-cap]]))

(dom/div {:classes ["h-5" "w-5"]}
  academic-cap)
```

For [Reagent](https://github.com/reagent-project/reagent),

```clojure
(ns my-file
  (:require [to.fluent.heroicons-clojure.reagent.outline.academic-cap :refer [academic-cap]]))

[:div {:class ["h-5" "w-5"]}
 academic-cap)
```

Each namespace also includes an alias of the icon name with the suffix `-icon`, which can be used to
avoid ambiguity.

## Building

Clone [heroicons](https://github.com/tailwindlabs/heroicons) into `heroicons` and run `./build.clj`.

Requires [babashka](https://github.com/babashka/babashka).

## License

The heroicons set is offered under [its original license](https://github.com/tailwindlabs/heroicons).

For simplicity, `heroicons-clojure` uses the same license.

## About

Library by [Fluent](https://fluent.to). Icons by [Adam Wathan](https://github.com/adamwathan).
