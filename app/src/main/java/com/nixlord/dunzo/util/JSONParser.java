package com.nixlord.dunzo.util;

import com.google.gson.*;
import com.nixlord.dunzo.model.RecognitionResult;
import com.phoenixoverlord.pravega.extensions.LoggerKt;

public class JSONParser {

    public static RecognitionResult parser(String jsonString) {
//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//
//        Gson gson= builder.create();


        JsonParser parser = new JsonParser();

        //String jsonString = "{\"name\":\"Mahesh Kumar\", \"age\":21,\"verified\":false,\"marks\": [100,90,85]}";
        //create tree from JSON
//        JsonElement rootNode = parser.parse(jsonString);
//        JsonObject details = rootNode.getAsJsonObject();
//        JsonElement element = details.getAsJsonArray("recognitionResults").getAsJsonArray();

        Gson g = new Gson();
        RecognitionResult result = g.fromJson(jsonString, RecognitionResult.class);
        LoggerKt.logDebug("JSONParser", result.toString());
        return result;
    }
}

