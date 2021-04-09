package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;


public class BitcoinDataModel {

    String price;

    public static BitcoinDataModel fromJSON(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            bitcoinData.price = jsonObject.getString("last");

            return bitcoinData;

        } catch(JSONException e) {

            e.printStackTrace();
            return null;

        }
    }

    public String getPrice() {
        return price;
    }
}
