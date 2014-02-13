(defproject clj-detector "0.0.1"
  :description "Clojure interface to UADetector, a library to analyse User-Agent strings"
  :url "http://github.com/pingles/clj-detector"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.sf.uadetector/uadetector-core "0.9.10"]]
  :profiles {:dev {:dependencies [[net.sf.uadetector/uadetector-resources "2013.10"]
                                  [org.slf4j/slf4j-simple "1.7.5"]]}})
