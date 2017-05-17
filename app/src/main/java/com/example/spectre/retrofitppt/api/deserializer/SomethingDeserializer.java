package com.example.spectre.retrofitppt.api.deserializer;

import android.util.Log;

import com.example.spectre.retrofitppt.model.Something;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Spectre on 5/17/2017.
 */

public class SomethingDeserializer implements JsonDeserializer<Something> {


    @Override
    public Something deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Log.d("BEST22","ee "+json.toString());
        return null;
    }
}
