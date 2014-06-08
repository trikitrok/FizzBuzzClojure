(ns fizz_buzz.core)

(defn fizz-buzz-number [num]
  (let [is-multiple-of? (fn [n] (= 0 (rem num n)))
        a-multiple-of-3 (is-multiple-of? 3)
        a-multiple-of-5 (is-multiple-of? 5)
        a-multiple-of-both (and a-multiple-of-3 a-multiple-of-5)]
    (cond
     a-multiple-of-both "FizzBuzz"
     a-multiple-of-3 "Fizz"
     a-multiple-of-5 "Buzz"
     :else (str num))))

(defn fizz-buzz [coll]
  (clojure.string/join
   \space
   (map fizz-buzz-number coll)))
