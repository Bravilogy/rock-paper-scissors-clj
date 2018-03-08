(defproject rock-paper-scissors "0.0.1"
  :description "An awesome game"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main rps.core
  :profiles {:uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "1.8.0"]])
