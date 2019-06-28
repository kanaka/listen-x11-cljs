(ns listen-x11-cljs.core
  (:require [cljs.pprint :refer [pprint]]
            [x11 :as x11]))

(defn ^:export start []
  (.createClient
    x11
    (fn [err display]
      (let [X (.-client display)
            root (.-root (aget (.-screen display) 0))
            mask (bit-or
                   (-> x11 (.-eventMask) (.-PointerMotion))
                   (-> x11 (.-eventMask) (.-KeyPress)))]
        (prn :root root)
        (prn :mask mask)
        (doto X
          (.ChangeWindowAttributes root (clj->js {"eventMask" mask})) 
          (.on "event" (fn [ev]
                         (prn :ev ev))))))))

(enable-console-print!)
(start)

