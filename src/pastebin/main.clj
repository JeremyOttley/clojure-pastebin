(ns pastebin.main
  (:require [pastebin.system :refer [init-system start!]]))

(defn -main [& args]
  (init-system)
  (start!))
