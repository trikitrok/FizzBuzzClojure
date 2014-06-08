(ns fizz_buzz.t-core
  (:use midje.sweet)
  (:use [fizz_buzz.core]))

(facts "about fizz-buzz-number"
       (fact "A number that is not a multiple of 3 and/or 5 is turned into a string"
             (fizz-buzz-number 1) => "1"
             (fizz-buzz-number 2) => "2")

       (fact "A number that is a multiple of 3 is turned into Fizz string"
             (fizz-buzz-number 3) => "Fizz"
             (fizz-buzz-number 9) => "Fizz")

       (fact "A number that is a multiple of 5 is turned into Buzz string"
             (fizz-buzz-number 5) => "Buzz"
             (fizz-buzz-number 25) => "Buzz")

       (fact "A number that is a multiple of 3 and 5 is turned into FizzBuzz string"
             (fizz-buzz-number 15) => "FizzBuzz"))

(facts "about fizz-buzz"
       (fact "An empty collection of numbers is turned into an empty string"
             (fizz-buzz []) => "")

       (fact "An collection of numbers is turned into a string in which each number is translated using fizz-buzz-number"
             (fizz-buzz (range 1 16)) => "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz"))

