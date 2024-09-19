package com.fpmislata.examenGames.domain.entity;

import java.util.List;

public class Game {
    int id;
    String game_code;
    String title;
    int release_year;
    String description;
    Director director;
    List<Character>characterList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGame_code() {
        return game_code;
    }

    public void setGame_code(String game_code) {
        this.game_code = game_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public Game() {
    }

    public Game(String game_code, String title, int release_year, String description, Director director) {
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
        this.director = director;

    }
    public Game(int id, String game_code, String title, int release_year, String description, Director director, List<Character> characterList) {
        this.id = id;
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
        this.director = director;
        this.characterList = characterList;
    }

    public Game(int id, String game_code, String title, int release_year, String description, Director director) {
        this.id = id;
        this.game_code = game_code;
        this.title = title;
        this.release_year = release_year;
        this.description = description;
        this.director = director;
    }
}
