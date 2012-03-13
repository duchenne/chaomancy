(ns chaomancy.maven
  (:gen-class))

(defn exclaim [] 
  "Yes, I wrote Clojure in Eclipse and tested/ran/deployed it with Maven!")
   
(defn -main [& args] (println (exclaim))) 
