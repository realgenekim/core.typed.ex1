(ns xyz.core
  {:lang :core.typed}
  (:require [clojure.core.typed :as t]
            [clojure.spec.alpha :as s]))

(t/warn-on-unannotated-vars)

;; Start: Generated by clojure.core.typed - DO NOT EDIT
(s/fdef foo2 :args (s/cat :n int?) :ret int?)
;; End: Generated by clojure.core.typed - DO NOT EDIT
;; Automatically added requires by core.typed
;(require '[clojure.spec.alpha :as s])

;(t/prepare-infer-ns)


(t/ann f [t/Any :-> t/Int])
(defn f [x]
  (t/cast t/Int x))

;(t/ann ^:no-check foo (t/IFn [Number -> Number]))

(t/ann foo (t/IFn [Number -> Number]))

(defn foo2 [n]
  (println "foo2")
  n)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!")
  ; this should generate a compile-time type error?
  (foo2 "abc")
  1)



(defn -main
  "I don't do a whole lot."
  [& args]
  (foo2 "abc")
  (println "Hello, World!"))