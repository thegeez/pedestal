(defproject template-server "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.3.2-SNAPSHOT"]
                 [io.pedestal/pedestal.jetty "0.3.2-SNAPSHOT"]
                 [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]

                 [hiccup "1.0.5"]
                 [enlive "1.1.5"]
                 [comb "0.1.0"]
                 [org.antlr/stringtemplate "4.0.2"]
                 [de.ubercode.clostache/clostache "1.4.0"]
]



  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "template-server.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.3.2-SNAPSHOT"]]}}
  :main ^{:skip-aot true} template-server.server)

