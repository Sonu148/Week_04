package com.training.reflection.intermediatelevel.accessandmodifystaticfield;

public class Configuration {

    // Static field to hold the API key
    private static String API_KEY = "123APL";

    //getter and setter for the api key field
    public static String getApiKey() {
        return API_KEY;
    }

    public static void setApiKey(String apiKey) {
        API_KEY = apiKey;
    }

}
