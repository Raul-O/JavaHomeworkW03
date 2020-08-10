package org.example;

public class Album extends Book{
    private String paperQuality;

    public void setPaperQuality() {
        System.out.println("Enter album's paper quality");
        paperQuality = Input.getString().toUpperCase();
    }

    public String getPaperQuality() {
        return paperQuality;
    }
}
