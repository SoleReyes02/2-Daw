package com.fpmislata.examen3eval.persistence.repository.impl;

import com.fpmislata.examen3eval.common.container.CharacterIOC;
import com.fpmislata.examen3eval.common.container.DirectorIOC;
import com.fpmislata.examen3eval.domain.entity.Character;
import com.fpmislata.examen3eval.domain.entity.Game;
import com.fpmislata.examen3eval.persistence.dao.CharacterDao;
import com.fpmislata.examen3eval.persistence.dao.DirectorDao;
import com.fpmislata.examen3eval.persistence.dao.GameDao;
import com.fpmislata.examen3eval.persistence.repository.GameRepository;

import java.util.ArrayList;
import java.util.List;

public class GameRepositoryImpl implements GameRepository {
    GameDao gameDao;
    DirectorDao directorDao;
    CharacterDao characterDao;

    public GameRepositoryImpl(GameDao gameDao) {
        this.gameDao = gameDao;
        this.directorDao = DirectorIOC.getDirectorDao();
        this.characterDao = CharacterIOC.getCharacterDao();
    }

    private Game completeGame(Game game){
        //Añadir listado de personajes
        List<Character> characterList = characterDao.findByGame(game.getId());
        game.setCharacterList(characterList);
        return game;
    }

    @Override
    public List<Game> findAll() {
        List<Game> gameList = new ArrayList<>();
        for (Game game:gameDao.findAll()){
            gameList.add(completeGame(game));
        }
        return gameList;
    }

    @Override
    public Game findByGameCode(String game_code) {
        return completeGame(gameDao.findByGameCode(game_code));
    }

    @Override
    public List<Game> findByDirector(int directorId) {
        List<Game> gameList = new ArrayList<>();
        for (Game game:gameDao.findByDirector(directorId)){
            gameList.add(completeGame(game));
        }
        return gameList;
    }

    @Override
    public void insert(Game game) {
        gameDao.insert(game);
    }
}
