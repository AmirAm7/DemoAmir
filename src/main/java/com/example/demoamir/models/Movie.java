package com.example.demoamir.models;

import java.lang.annotation.Repeatable;
import java.time.LocalDate;


public class Movie {
    private String title;
    private int id;
    private String description;
    private LocalDate years;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getYears() {
        return years;
    }

    public void setYears(LocalDate years) {
        this.years = years;
    }
}
