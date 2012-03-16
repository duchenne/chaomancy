(ns chaomancy.test.maven
  (:use chaomancy.maven)
  (:use clojure.test))

(deftest test-maven-msg 
  (is (= (exclaim) 
         "Yes, I wrote Clojure in Eclipse and tested/ran/deployed it with Maven!")))