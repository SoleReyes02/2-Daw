package com.fpmislata.examen3eval.domain.entity;

public class Director {
    int id;
    String name;
    String biography;

    public Director() {
    }

    public Director(int id) {
        this.id = id;
    }

    public Director(int id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
