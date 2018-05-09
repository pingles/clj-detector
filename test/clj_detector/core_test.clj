(ns clj-detector.core-test
  (:require [clojure.test :refer :all]
            [clj-detector.core :refer :all]))

(deftest parse-user-agent-test
  (let [agent-string "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; WOW64; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; .NET CLR 3.5.21022; .NET CLR 3.5.30729; .NET CLR 3.0.30618; MDDC; .NET4.0C; InfoPath.2; BRI/2)"
        agent (user-agent agent-string)]
    (is (= "IE" (:name agent)))
    (is (= "Microsoft Corporation." (:producer agent)))
    (is (= :browser (:type agent)))
    (is (= "7.0" (:version agent)))
    (is (= :pc (:device agent)))
    (is (= (:os agent)
           {:name "Windows Vista" :family "Windows" :version "6.0"}))))
