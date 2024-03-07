package com.example.translatorapp;

public class WordModal {
    private String englishWord;
    private String kikuyuWord;
    private int image;

    public WordModal() {
    }

    public WordModal(String englishWord, String kikuyuWord, int image) {
        this.englishWord = englishWord;
        this.kikuyuWord = kikuyuWord;
        this.image = image;
    }
//setters and getters
    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getKikuyuWord() {
        return kikuyuWord;
    }

    public void setKikuyuWord(String kikuyuWord) {
        this.kikuyuWord = kikuyuWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
