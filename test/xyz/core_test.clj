(ns xyz.core-test
  (:require [clojure.test :refer :all]
            [xyz.core :refer :all]
            [clojure.core.typed :as t]
            [clojure.spec.alpha :as s]))


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1)))
  (testing "foo inferene"
    (is (= 2 (foo2 2)))))
