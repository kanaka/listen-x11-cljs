(defproject listen-x11-cljs "0.0.1"
  :description "ClojureScript X11 Event Listener."
  :url "http://example.com/FIXME"
  :license {:name "Mozilla Public License version 2"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-npm "0.6.2"]]

  :source-paths ["src"]

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]]

  :npm {:dependencies [[x11 "2.3.0"]]}

  :cljsbuild
  {:builds {:app
            {:source-paths ["src"]
             :compiler
             {:main          "listen-x11-cljs.core"
              :output-to     "target/app.js"
              :output-dir    "target/out"
              :source-map    true
              :target        :nodejs
              :optimizations :none
              :pretty-print  true}}}})
