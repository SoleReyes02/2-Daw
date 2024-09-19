package com.fpmislata.examen3eval.common.container;

import com.fpmislata.examen3eval.domain.service.GameService;
import com.fpmislata.examen3eval.domain.service.impl.GameServiceImpl;
import com.fpmislata.examen3eval.persistence.dao.GameDao;
import com.fpmislata.examen3eval.persistence.dao.jdbc.GameDaoJdbc;
import com.fpmislata.examen3eval.persistence.repository.GameRepository;
import com.fpmislata.examen3eval.persistence.repository.impl.GameRepositoryImpl;

public class GameIOC {
    public static GameService gameService;
    public static GameRepository gameRepository;
    public static GameDao gameDao;

    public static GameService getGameService() {
        if (gameService==null){
            gameService = new GameServiceImpl(getGameRepository());
        }
        return gameService;
    }

    public static void setGameService(GameService gameService) {
        GameIOC.gameService = gameService;
    }

    public static GameRepository getGameRepository() {
        if (gameRepository==null){
            gameRepository= new GameRepositoryImpl(getGameDao());
        }
        return gameRepository;
    }

    public static void setGameRepository(GameRepository gameRepository) {
        GameIOC.gameRepository = gameRepository;
    }

    public static GameDao getGameDao() {
        if (gameDao==null){
            gameDao = new GameDaoJdbc();
        }
        return gameDao;
    }

    public static void setGameDao(GameDao gameDao) {
        GameIOC.gameDao = gameDao;
    }
}
