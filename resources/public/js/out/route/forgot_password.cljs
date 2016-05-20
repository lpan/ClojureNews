(ns route.forgot-password
  (:require-macros [secretary.core :refer [defroute]])
  (:require [reagent.core :as r]
            [secretary.core]
            [view.forgot-password]
            [util.view]))

(defroute forgot-password "/forgotpassword" []
          (r/render-component [view.forgot-password/component] util.view/main-container))