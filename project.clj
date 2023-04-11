(defproject org.clojars.bipinprasad/carbonite "1.6.0"
  ;; Deploy Steps
  ;;    lein clean
  ;;    lein install
  ;;    lein deploy clojars
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-options ["-source" "1.8" "-target" "1.8"]
  :description "Write Clojure data to and from bytes using Kryo."
  :repositories [["central" {:url "https://repo1.maven.org/maven2/"}]
                 ["clojars" {:url "https://clojars.org/repo/"}]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.esotericsoftware/kryo "4.0.2"]
                 [com.twitter/chill-java "0.9.5"]]
;  :plugins [[lein-deploy-clojars "RELEASE"]]
  :license {:name "Apache License"}
  :url "https://github.com/bipinprasad/carbonite"
  :scm {:url "https://github.com/bipinprasad/carbonite"
        :connection "scm:git:git://github.com/bipinprasad/carbonite.git"
        :developer {:name "Bipin Prasad"
                    :email "bipinprasad@apache.org"}}
  :developers [{:name "Bipin Prasad"
                :email "bipinprasad@apache.org"
                :roles [:developer]}]
;  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
;                                    :username :env/MVN_USERNAME
;                                    :password :env/MVN_PASSWORD}
;                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots/"
;                                     :username :env/MVN_USERNAME
;                                     :password :env/MVN_PASSWORD}}
  :deploy-repositories {"releases" {:url "https://clojars.org/repo/"
                                    :username :env/CLOJARS_USERNAME
                                    :password :env/CLOJARS_API_KEY
                                    :sign-releases true  ;; set this to true and run lein deploy from Mac so the jar/pom can be signed
                                    }
                        "snapshots" {:url "https://clojars.org/repo/"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_API_KEY
                                     :snapshot true
                                     }}
  :profiles {:1.2 {:dependencies [[org.clojure/clojure "1.2.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}}
  )
