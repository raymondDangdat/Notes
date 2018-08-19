package com.example.raymond.notes;

public class Note {
    private String title;
    private String description;
    private int priority;


    //empty consctructor


    public Note() {
    }

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    //get getters


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
