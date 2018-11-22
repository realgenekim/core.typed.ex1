; core.typed home page:
; https://github.com/clojure/core.typed
;
; following tutorial of spec generation here:
; https://frenchy64.github.io/2018/04/12/how-to-generate-your-specs.html
;
; lein typed infer-spec xyz.core
; lein typed check xyz.core



(defproject xyz "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0-beta5"]
                 [org.clojure/core.typed "0.7.0"]]
  :profiles {:dev {:dependencies []
                   :plugins      [[lein-typed "0.4.6"]]
                   :injections   [(require 'clojure.core.typed)
                                  (clojure.core.typed/install)]}}
  :main xyz.core)
