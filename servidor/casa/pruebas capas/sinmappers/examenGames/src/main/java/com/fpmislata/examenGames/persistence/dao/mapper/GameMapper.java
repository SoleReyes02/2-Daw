package com.fpmislata.examenGames.persistence.dao.mapper;


import com.fpmislata.examenGames.domain.entity.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameMapper {
    public static Game toGame(ResultSet resultSet) {
        if (resultSet == null) {
            return null;
        }
        try {
            return new Game(resultSet.getInt("g.id"),
                    resultSet.getString("g.game_code"),
                    resultSet.getString("g.title"),
                    resultSet.getInt("g.release_year"),
                    resultSet.getString("g.description"),
                    new Director(resultSet.getInt("d.id"),
                            resultSet.getString("d.name"),
                            resultSet.getString("d.biography")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Game> toGameList(ResultSet resultSet) {
        List<Game> gameList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                gameList.add(toGame(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return gameList;
    }
}
