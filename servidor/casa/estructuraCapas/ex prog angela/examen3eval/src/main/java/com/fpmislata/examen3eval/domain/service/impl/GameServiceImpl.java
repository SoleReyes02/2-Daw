package com.fpmislata.examen3eval.domain.service.impl;

import com.fpmislata.examen3eval.common.exceptions.ServiceException;
import com.fpmislata.examen3eval.domain.entity.Game;
import com.fpmislata.examen3eval.domain.service.GameService;
import com.fpmislata.examen3eval.persistence.repository.GameRepository;

import java.util.List;

public class GameServiceImpl implements GameService {
    GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public Game findByGameCode(String game_code) {
        Game game = gameRepository.findByGameCode(game_code);
        if (game==null){
            throw new ServiceException("Este codigo no esta asociado con ningun juego");
        }
        return game;
    }

    @Override
    public List<Game> findByDirector(int directorId) {
        List<Game> gameList = gameRepository.findByDirector(directorId);
        if (gameList.isEmpty()){
            throw new ServiceException("Este director no tiene ningun juego");
        }
        return gameList;
    }

    @Override
    public void insert(Game game) {
        if(game.getGame_code() == null){
            throw new ServiceException("Insercion no valida, game code vacio");
        }
        gameRepository.insert(game);
    }
}
