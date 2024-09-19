package com.fpmislata.examen3eval.persistence.repository;

import com.fpmislata.examen3eval.domain.entity.Game;

import java.util.List;

public interface GameRepository{
    public List<Game> findAll();
    public Game findByGameCode(String game_code);
    public List<Game> findByDirector(int directorId);
    public void insert(Game game);
}
