(ns clojuredocs.css
  (:require [garden.stylesheet :refer [at-media]]
            [nsfw.css :as nc]))

(def blue "rgba(66, 139, 202, 1)")

(def light-blue "rgba(66, 139, 202, 0.8)")

(def lightest-blue "rgba(66, 139, 202, 0.1)")

(def light-black "rgba(0,0,0,0.05);")

(def code-bg "rgba(0,0,0,0.01)")

(def monospace-font "Monaco, Menlo, Consolas, \"Courier New\", monospace")

(def intro-page
  [[:.xkcd {:display 'block
            :margin-left 'auto
            :margin-right 'auto}]

   [:.intro {:margin-bottom "30px"}]
   [:.intro-page
    [:section
     {:margin-bottom "40px"}
     (nc/at-bp {:margin-bottom "20px"})]
    [:.quick-lookup-wrapper
     {:background-color 'white
      :margin "-30px -25px"
      :padding "30px 25px"}
     (nc/at-bp {:margin 0
                :padding 0})
     [:input.query
      {:font-size "20px"
       :padding "10px 15px"}
      (nc/at-bp {:font-size "16px"})]]
    [:.code-example
     [:font-size "14px"
      :padding "20px"
      :border "solid transparent 1px"
      :background-color "#fafafa"]]
    [:.row
     {:margin-bottom "0px"}]
    [:.top-contribs
     [:.avatar
      {:width "3.63%"
       :margin-right "0.53%"
       :margin-bottom "0.53%"
       :height 'auto}
      (nc/at-bp :xs
        {:width "7.80%"
         :height 'auto})]]
    [:.migrate-account
     {:text-align 'right
      :font-size "12px"}]
    [:.getting-started-resources
     {:margin-bottom "20px"}
     [:li {:list-style-type 'disc
           :margin-left "30px"}]]
    [:.syntaxify
     {:padding "15px"
      :overflow 'auto
      :overflow-y 'hidden
      :font-family monospace-font
      :font-size "15px"
      :line-height "1.3em"}
     (nc/at-bp :md {:font-size "12px"})
     (nc/at-bp :sm {:font-size "13px"})
     (nc/at-bp :xs {:font-size "12px"})
     [:table {:margin "0 auto"}]]
    [:ul
     [:h4
      [:i {:margin-right "12px"
           :margin-left "-30px"}]
      [:i.fa-map-marker {:padding "0 3px"}]]]
    [:.used-by
     [:ul {:text-align 'center}]
     [:li {:display 'inline-block
           :margin-right "30px"
           :margin-bottom "20px"}]
     [:img {:max-width "200px"
            :max-height "50px"}
      (nc/at-bp :md {:max-height "35px"})
      (nc/at-bp :sm {:max-height "50px"})]]
    [:.recently-updated
     {:margin-bottom "5px"
      :font-size "13px"
      :color "#999"
      :line-height "17px"
      :clear 'both}
     [:.clear {:clear 'both}]
     [:.avatar-link
      {:margin-right "10px"
       :float 'left
       :display 'inline-block
       :padding-top "2px"}]]]])

(def autocomplete
  [[:.ac-result-link:hover {:text-decoration 'none
                            :width "100%"}]

   [:.ac-result
    [:td {:padding "10px"}]
    [:.docstring {:color "#444"}]]

   [:ul.ac-results
    {:margin-left 0
     :margin-bottom 0}
    [:li {:margin-left 0
          :list-style-type 'none
          :cursor 'pointer
          :padding "10px"
          :margin-top "5px"
          :margin-bottom "5px"
          :padding-bottom "15px"}
     [:&.highlighted {:background-color "rgba(0,0,0,0.02)"}]
     [:p {:margin-bottom 0}]
     [:i {:margin-left 0
          :color "#666"
          :width "15px"
          :text-align 'right}]]]
   [:.ac-entry {:position 'relative}
    [:.ac-type
     {:position 'absolute
      :right 0
      :top 0
      :font-size "10px"
      :text-transform 'uppercase
      :color "#aaa"
      :line-height "12px"}]
    [:p {:margin-bottom "10px"}]
    [:.see-alsos {:font-size "14px"
                  :color "#aaa"}
     [:.see-also-label {:margin-right "10px"}]
     [:ul {:display 'inline-block}
      [:li {:margin 0
            :padding 0
            :margin-right "10px"
            :display 'inline-block}]]]]
   [:table.ac-results {:width "100%"
                       :font-szie "15px"}
    [:td {:padding-bottom "20px"
          :vertical-align 'top}]
    [:.ac-result
     [:.name {:vertical-align 'top
              :margin-right "10px"
              :font-weight 'bold
              :white-space 'nowrap}]
     [:.docstring {:vertical-align 'top
                   :max-width "700px"}
      [:a {:display 'block
           :color "#444"}]]]
    [:.ac-metadata
     {:font-weight 'normal
      :color "#999"
      :font-size "12px"
      :white-sapce 'nowrap}]]])

(def var-page
  [[:.var-header
    [:h1.var-name
     {:margin-bottom "5px"}]
    [:.var-meta
     {:margin-bottom "10px"
      :font-size "13px"
      :line-height "1.3em"
      :color "#888"
      :text-align 'right}
     (nc/at-bp :xs {:text-align 'left})
     [:h2 {:margin-bottom "5px"}]
     [:ul :li :.added
      {:margin-bottom "3px"}]
     [:li {:display 'inline-block}]]
    [:.arglists {:margin-left 0
                 :padding-left 0
                 :font-family monospace-font
                 :font-size "14px"}
     [:li {:margin 0
           :display 'inline-block
           :margin-right "10px"
           :margin-bottom "10px"
           :padding "0 5px"
           :background-color "#f8f8f8"}]]]

   [:.var-page :.example-page
    [:h1 :h2 {:margin-top 0}]
    [:pre {:border 'none}]
    [:section {:margin-bottom "2em"}]
    [:section.search {:margin-bottom "1em"}]
    [:.null-state {:margin-bottom "30px"}]
    [:.docstring
     [:pre {:background-color "#f8f8f8"
            :color "#555"
            :font-size "15px"
            :line-height "1.4em"
            :margin-bottom 0
            :padding "15px 10px"}
      (nc/at-bp :md {:font-size "12px"})
      (nc/at-bp :sm {:font-size "13px"})
      (nc/at-bp :xs {:font-size "12px"})]
     [:.copyright {:text-align 'right
                   :font-size "10px"
                   :color "#bbb"}
      [:a {:color "#bbb"}]]]
    [:.example {:margin-bottom "30px"}]]
   [:.example-meta :.note-meta
    {:font-size "10px"
     :margin-bottom 0
     :line-height "1.3em"
     :margin-right "5px"
     :color "#888"}
    [:.avatar {:width "25px"
               :height "25px"
               :opacity 0.8}
     [:&:hover {:opacity 1}]]]
   [:.note {:margin-bottom "30px"}]
   [:.note-meta {:margin-bottom "10px"}
    [:.avatar {:margin "0 2px"}]]
   (let [r [:&
            {:font-size "15px"}
            (nc/at-bp :md {:font-size "12.5px"})
            (nc/at-bp :sm {:font-size "11.5px"})]]
     [[:.var-example [:.syntaxify r]]
      [:.tabbed-editor
       [:.example-editor
        [:textarea.form-control r]
        [:.columns-guide r]]
       [:pre.syntaxify r]]])
   [:.var-example
    {:margin-bottom "30px"}
    [:&.highlighted
     {:border-top "solid #FFA500 4px"
      :border-bottom "solid #FFA500 4px"
      :padding-top "5px"
      :padding-bottom "5px"}]
    [:.example {:margin-bottom "30px"}]
    [:.syntaxify [:table {:margin 0}]]]
   [:.example-meta
    {:color "#aaa"}
    [:.avatar {:margin-right "5px"}]
    [:.contributors :.created :.last-updated :.links
     {:display 'inline-block
      :margin-right "5px"
      :margin-bottom "5px"}]]
   [:.example-meta :.see-also
    :.delete-controls :.note-meta
    [:.loading {:width "9px"
                :margin-bottom "2px"}]
    [:.error-deleting
     {:padding-left "3px"
      :padding-right "3px"}]]
   [:.example-page
    [:.current-example
     {:border "solid rgba(255,243,109, 0.3) 5px"
      :padding "10px"
      :background-color 'transparent
      :margin-bottom "20px"}]
    [:.example-meta
     [:.created {:display 'block}]]]
   [:.example-code
    {:margin-bottom "15px"
     :background-color "#fafafa"
     :border-top "solid #ddd 5px"}]
   [:.ns-tree
    {:font-size "14px"}
    [:h3 {:font-size "12px"}]
    [:li {:margin-bottom 0}]
    ["li > ul" {:margin-left "10px"}]
    [:.current {:font-weight 'bold}]]
   [:.syntaxify [:* {:font-weight monospace-font}]]
   [:.toc {:margin-bottom "20px"}
    [:h5 {:margin 0
          :margin-bottom "10px"
          :font-size "12px"
          :margin-right 0
          :margin-top 0}]
    [:h6 {:margin-top 0}]
    [:ul {:margin-bottom "5px"}]
    [:.toc-sphere
     [:h5 {:margin-bottom "5px"}]
     [:ul {:padding 0
           :margin-bottom "15px"}]
     [:li {:margin-left "10px"
           :font-size "12px"
           :margin-bottom 0
           :line-height "1.5em"}]]
    [:.quickref-mobile-toc
     [:h5 {:color 'white
           :margin-bottom "5px"
           :margin-top 0}]
     [:.categories {:font-size "12px"
                    :line-height "16px"}]]]])

(def app
  [[:html :body {:-webkit-font-smothing 'antialiased
                 :height "100%"
                 :font-family "\"Helvetica Neue\", Helvetica, sans-serif"
                 :color "#444"}]
   [:body {:font-size "16px"
           :line-height "1.5em"
           :transition "all 0.2s ease-in"
           :height "100%"}
    [:&.search-active {:background-color light-black}]]
   [:img {:max-width "100%"}]
   [:h1 :h2 :h3 :h4 :h5 :h6 {:font-weight 'normal}]
   [:h1 {:font-size "28px"
         :line-height "36px"
         :margin-bottom "20px"}
    [:&:first-of-type {:margin-top 0}]]
   (at-media {:max-width "767px"}
     [:h1 {:font-size "20px"
           :line-height "30px"}])

   [:h2 {:font-size "24px"
         :line-height "34px"
         :margin-bottom "20px"}]
   [:h5 {:font-size "15px"
         :font-weight 500
         :text-transform 'uppercase
         :letter-spacing "1px"
         :color "#777"
         :margin-bottom "10px"}]
   [:p {:font-size "17px"
        :margin-bottom "1.4em"
        :line-height "1.6em"}]
   [:li {:margin-bottom "0.5em"
         :list-style-type 'none}]
   [:pre {:border-radius "0px"
          :border 'none
          :word-wrap 'normal}]
   [:ul {:padding 0}]
   [:section {:margin-bottom "40px"}]
   [:code {:font-size "14px"}]
   ["a > code" {:color blue}]
   [:.badge {:background-color #_"rgba(0,0,0,0.05)" 'transparent
             :color "rgba(0,0,0,0.2)"
             :border-radius "3px"
             :padding "1px 5px"
             :font-weight 500
             :margin-left "5px"
             :font-size "14px"
             :line-height "22px"}]

   ;; check
   [:.sticky-wrapper {:min-height "100px"
                      :height ["auto !important" "100%"]}]
   [:footer :.sticky-push {:height "200px"}]
   [:footer
    {:text-align 'center
     :font-size "12px"
     :padding-top "130px"}
    [:.divider {:font-size "16px"}]
    [:.ctas {:line-height "30px"}
     [:iframe {:margin-bottom "-6px"
               :margin-left "10px"}]
     [:.gh-starred-count {:width "95px"}]]
    [:.left {:text-align 'right}]
    [:.right {:text-align 'left}]

    (nc/at-bp :xs
      [:.left :.right {:text-align 'center}])]

   [:.avatar
    {:display 'inline-block
     :border-radius "3px"
     :width "48px"
     :height "48px"}]
   [:body.user-page
    [:.user-avatar
     [:.avatar {:width "200px"
                :height "200px"}]]]
   [:.form-group
    [:.loading
     {:margin-top "9px"
      :margin-bottom "10px"}]
    [:.error-message
     {:margin-top "5px"
      :margin-right "10px"
      :padding "10px"}
     [:i {:margin-right "8px"}]]]

   [:header.navbar
    {:border-radius 0
     :margin-bottom "20px"}
    (nc/at-bp :xs {:margin-bottom "10px"})
    [".nav > li > a" {:padding "15px 12px"}]
    [:i {:margin-right "5px"}]
    (nc/at-bp :xs [:.navbar-brand
                   {:float 'none
                    :display 'inline-block
                    :padding-left 0}])
    [:.btn.mobile-menu {:border 'none
                        :margin-top "5px"
                        :font-size "18px"
                        :display 'none}
     [:i {:margin 0}]]
    [:.user-area {:font-size "14px"
                  :color "#999"}]
    [:.navbar-nav {:padding-right 0
                   :margin 0}
     [:li {:margin-bottom 0
           :font-size "14px"}]]
    [:.quick-search-widget
     [:form
      {:margin-right "10px"}]]
    [:.gh-starred-count
     {:margin-top "15px"
      :line-height "20px"
      :margin-left "10px"}]
    [:.clojure-version
     {:font-weight 300
      :font-size "12px"
      :font-family monospace-font
      :color "#ccc"
      :line-height "21px"}
     [:a {:line-height "20px"
          :color "#ccc"
          :font-weight 300}]]]
   [:.mobile-nav-bar {:display 'none}]
   [:.navbar-nav
    [:i {:margin-right "5px"}]
    [:.avatar {:width "22px"
               :height "22px"
               :margin-right "5px"}]]
   [:.mobile-nav-menu
    {:display 'none
     :overflow-y 'scroll
     :overflow-x 'hidden
     :-webkit-overflow-scrolling 'touch
     :height "100%"}]
   [:.desktop-side-nav
    [:.badge
     {:float 'right}]]

   [:.mobile-nav-menu
    [:.badge
     {:font-size "16px"
      :color "rgba(255,255,255,0.5)"
      :font-weight 300
      :float 'right
      :line-height "22px"
      :margin 0
      :padding 0}]]
   (nc/at-bp :xs
     [:header.navbar
      [:.btn.mobile-menu
       {:display 'block
        :margin-right "-11px"}]
      [:.quick-search-widget {:display 'none}]
      [:.navbar-nav {:display 'none}]]
     [:.mobile-push-wrapper
      (merge
        {:right 0
         :position 'relative
         :padding-top "60px"
         :transform "translate3d(0,0,0)"}
        (nc/transition "all 0.2s ease"))]
     [:.desktop-nav-bar :.desktop-side-nav {:display 'none}]
     [:.mobile-nav-bar
      (nc/transition "all 0.2s ease")
      {:background-color 'white
       :position 'fixed
       :top 0
       :width "100%"
       :z-index 1000
       :display 'block}
      [:header {:margin-bottom 0}]]
     [:.mobile-nav-menu
      (nc/transition "all 0.2s ease")
      {:transform "translate3d(200px,0,0)"}
      {:display 'block
       :position 'fixed
       :width "200px"
       :z-index 10000
       :background-color "#47a3da"
       :color 'white
       :font-weight 300
       :top 0
       :bottom 0
       :right 0
       :margin 0
       :overflow-y 'scroll}
      [:h4 {:padding "5px 10px"
            :border-bottom "solid rgba(255,255,255,0.3) 1px"
            :margin 0
            :color "rgba(255,255,255,0.8)"
            :font-size "14px"
            :letter-spacing "1px"
            :font-weight 500}
       [:i {:margin-right "5px"}]]
      [:li {:margin 0}
       [:a {:color 'white}
        [:&:hover {:background-color "#258ecd"}]]]
      [:.navbar-nav {:margin 0}]]
     [:.mobile-push-wrapper.mobile-push
      (nc/transition "all 0.2s ease")
      {:transform "translate3d(-200px,0,0)"
       :right 0}]
     [:.mobile-nav-menu.mobile-push
      (nc/transition "all 0.2s ease")
      {:transform "translate3d(0,0,0)"}
      [:header.navbar
       (nc/transition "all 0.2s ease")
       {:right "200px"}]]
     [:.mobile-nav-bar.mobile-push
      (nc/transition "all 0.2s ease")
      {:transform "translate3d(-200px,0,0)"}]
     [:.page-toc {:display 'none}]
     [:body.search-active {:background-color 'transparent}]
     [:.clojure-version {:font-weight 300
                         :color "rgba(255,255,255,0.7)"
                         :font-family monospace-font
                         :margin-left "5px"
                         :font-size "10px"}])



   [:.null-state {:background-color "#fafafa"
                  :text-align 'center
                  :padding "20px"
                  :color "#888"}
    [:code {:color "#888"}]
    [:a {:color "rgba(66, 139, 202, 0.7)"}]]

   intro-page

   [:.see-also
    {:margin-bottom "20px"}
    [:a {:color "#999"}
     [:.name {:color "#428bca"}
      [:&:hover {:color "#2a6496"}]]]
    [:p {:color "#555"
         :margin-bottom 0}]
    [:.meta {:font-size "10px"
             :color "#ccc"
             :text-transform 'uppercase}
     [:a {:color "#ccc"}]]
    [:.delete-confirmation [:a {:color "#428bca"}]]]

   [:input.loading
    {:background-image "url('/img/loading.gif')"
     :background-repeat 'no-repeat
     :background-position "right 8px center"}]

   [:form.search
    [:input.query
     {:border-radius 0
      :min-width "200px"
      :height "100%"
      :font-size "14px"
      :padding "6px 12px"}]
    [:input.placeholder {:visibility 'hidden}]]

   [:.syntaxify {:padding 0
                 :background-color 'transparent
                 :word-wrap 'normal}]

   autocomplete

   var-page])