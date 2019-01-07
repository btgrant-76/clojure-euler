(ns clojure-euler.four-test
  (:require [clojure.test :refer :all]
            [clojure-euler.four :refer :all]))

(deftest palindromic-numbers
  (testing "22, 9009 and 55011055 are palindromic")
    (is (every? #(palindromic? %) '(22 9009 55011055)))
  )
