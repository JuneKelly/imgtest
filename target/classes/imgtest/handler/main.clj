(do (clojure.core/ns imgtest.handler.main (:require ring.server.leiningen) (:gen-class)) (clojure.core/defn -main [] (ring.server.leiningen/serve (quote {:ring {:auto-reload? false, :stacktraces? false, :open-browser? false, :destroy imgtest.handler/destroy, :init imgtest.handler/init, :handler imgtest.handler/app}}))))
