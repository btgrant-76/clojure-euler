(ns clojure-euler.four)

; A palindromic number reads the same both ways. The largest palindrome made from the product of
; two 2-digit numbers is 9009 = 91 × 99.
;
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn palindromic-string? [num-string]
  (def split-string (split-at ((/ (count num-string) 2)) num-string))
  (def first-half "foo")
  (def second-half "oof")
  (println first-half (reverse second-half))

  (= first-half (reverse second-half)))

(defn palindromic? [number]
  (def number-string (str number))
  (if (= (mod (count number-string) 2) 0)
    (palindromic-string? number-string)
    false)

)
