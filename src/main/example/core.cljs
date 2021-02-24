(ns example.core
  (:require [re-frame.core :refer [dispatch-sync]]
            ["bugout" :as Bugout]))

(defn init [] (println "OK"))
