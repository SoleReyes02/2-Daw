package com.fpmislata.examenGames.persistence.dao;

import com.fpmislata.examenGames.domain.entity.Game;

import java.util.List;

public interface GameDao {
    List<Game> findAll();
    Game findByGameCode();
    List<Game> findByDirector();
    void insert(Game game);

}
