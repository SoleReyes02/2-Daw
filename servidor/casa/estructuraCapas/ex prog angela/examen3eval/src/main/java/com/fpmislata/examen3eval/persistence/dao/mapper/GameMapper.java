package com.fpmislata.examen3eval.persistence.dao.mapper;

import com.fpmislata.examen3eval.domain.entity.Director;
import com.fpmislata.examen3eval.domain.entity.Game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameMapper {
    public static Game toGame(ResultSet resultSet){
        if(resultSet == null) {
            return null;
        }
        try {
            //nombres de las columnas en la bbdd
            return new Game(
                    resultSet.getInt("g.id"),
                    resultSet.getString("g.game_code"),
                    resultSet.getString("g.title"),
                    resultSet.getInt("g.release_year"),
                    resultSet.getString("g.description"),
                    new Director(resultSet.getInt("d.id"),
                            resultSet.getString("d.name"),
                            resultSet.getString("d.biography"))
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Game> toGameList(ResultSet resultSet){
        List<Game> gameList = new ArrayList<>();
        try{
            while(resultSet.next()){
                gameList.add(toGame(resultSet));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return gameList;
    }

}
