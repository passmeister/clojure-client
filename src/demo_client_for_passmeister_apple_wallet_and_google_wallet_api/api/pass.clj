(ns demo-client-for-passmeister-apple-wallet-and-google-wallet-api.api.pass
  (:require [demo-client-for-passmeister-apple-wallet-and-google-wallet-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-or-update-pass-with-http-info
  "This method creates or (if the pass id already exists) updates a pass, so you don't have to track ids and creation status of your passes.
  This method creates or (if the pass id already exists) updates a pass, so you don't have to track ids and creation status of your passes."
  ([pass-type-id ] (create-or-update-pass-with-http-info pass-type-id nil))
  ([pass-type-id {:keys [pass-id ]}]
   (check-required-params pass-type-id)
   (call-api "/pass" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"passTypeId" pass-type-id "passId" pass-id }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn create-or-update-pass
  "This method creates or (if the pass id already exists) updates a pass, so you don't have to track ids and creation status of your passes.
  This method creates or (if the pass id already exists) updates a pass, so you don't have to track ids and creation status of your passes."
  ([pass-type-id ] (create-or-update-pass pass-type-id nil))
  ([pass-type-id optional-params]
   (:data (create-or-update-pass-with-http-info pass-type-id optional-params))))

(defn delete-pass-with-http-info
  "Delete pass by pass id.
  Delete pass by pass id."
  [pass-type-id pass-id ]
  (check-required-params pass-type-id pass-id)
  (call-api "/pass" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {"passTypeId" pass-type-id "passId" pass-id }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn delete-pass
  "Delete pass by pass id.
  Delete pass by pass id."
  [pass-type-id pass-id ]
  (:data (delete-pass-with-http-info pass-type-id pass-id)))

(defn get-pass-with-http-info
  "Get pass information by pass id.
  Get pass information by pass id."
  [pass-type-id pass-id ]
  (check-required-params pass-type-id pass-id)
  (call-api "/pass" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"passTypeId" pass-type-id "passId" pass-id }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn get-pass
  "Get pass information by pass id.
  Get pass information by pass id."
  [pass-type-id pass-id ]
  (:data (get-pass-with-http-info pass-type-id pass-id)))

(defn pass-list-with-http-info
  "Retrieve the list of active pass ids for a given pass type.
  Retrieve the list of active pass ids for a given pass type."
  ([pass-type-id ] (pass-list-with-http-info pass-type-id nil))
  ([pass-type-id {:keys [page limit ]}]
   (check-required-params pass-type-id)
   (call-api "/pass/list" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"passTypeId" pass-type-id "page" page "limit" limit }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn pass-list
  "Retrieve the list of active pass ids for a given pass type.
  Retrieve the list of active pass ids for a given pass type."
  ([pass-type-id ] (pass-list pass-type-id nil))
  ([pass-type-id optional-params]
   (:data (pass-list-with-http-info pass-type-id optional-params))))

(defn pass-sync-with-http-info
  "Send updates to all active passes for a given pass type.
  For example: you changed the pass type layout and now you want to update all installed passes. (The API call only confirms the scheduling of the updates, actual updating of passes on your customers devices can take a while.)"
  [pass-type-id ]
  (check-required-params pass-type-id)
  (call-api "/pass/sync" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"passTypeId" pass-type-id }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn pass-sync
  "Send updates to all active passes for a given pass type.
  For example: you changed the pass type layout and now you want to update all installed passes. (The API call only confirms the scheduling of the updates, actual updating of passes on your customers devices can take a while.)"
  [pass-type-id ]
  (:data (pass-sync-with-http-info pass-type-id)))

