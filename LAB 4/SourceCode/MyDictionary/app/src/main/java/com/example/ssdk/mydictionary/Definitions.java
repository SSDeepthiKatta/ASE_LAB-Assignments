package com.example.ssdk.mydictionary;

/**
 * Created by SatyaSaiDeepthi on 2/15/2017.
 */

import com.google.gson.annotations.SerializedName;

public class Definitions {
    @SerializedName("definition")
    private String definition;
    @SerializedName("partOfSpeech")
    private String partOfSpeech;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}
