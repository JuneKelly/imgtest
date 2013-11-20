(ns imgtest.routes.home
  (:use compojure.core)
  (:require [imgtest.views.layout :as layout]
            [imgtest.util :as util]))


(def example-user
  {:_id "john"
   :full_name "John Doe"
   :gravatars
   { :small "https://secure.gravatar.com/avatar/d32fc9a3ced31388174960deee2f43af.jpg?s=100&r=pg&d=mm&",
     :large "https://secure.gravatar.com/avatar/d32fc9a3ced31388174960deee2f43af.jpg?s=300&r=pg&d=mm&"}})


(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")
                 :user example-user}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))
