package com.example.ssdk.mydictionary;

/**
 * Created by SatyaSaiDeepthi on 2/15/2017.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DefResponse {

    @SerializedName("word")
    private String word;
    @SerializedName("definitions")
    private List<Definitions> definitions;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definitions> definitions) {
        this.definitions = definitions;
    }
}
