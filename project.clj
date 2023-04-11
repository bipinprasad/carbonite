(defproject org.apache.storm/carbonite "1.6.0"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-options ["-source" "1.8" "-target" "1.8"]
  :description "Write Clojure data to and from bytes using Kryo."
  ;;:repositories {"mvncentral" "https://repo1.maven.org/maven2/"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.esotericsoftware/kryo "4.0.2"]
                 [com.twitter/chill-java "0.9.5"]]
  :scm {:url "https://github.com/bipinprasad/carbonite"
        :connection "scm:git:git://github.com/bipinprasad/carbonite.git"
        :developer {:name "Bipin Prasad"
                    :email "bipinprasad@apache.org"}}
  :developers [{:name "Bipin Prasad"
                :email "bipinprasad@apache.org"
                :roles [:developer]}]
  :profiles {:1.2 {:dependencies [[org.clojure/clojure "1.2.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}})
