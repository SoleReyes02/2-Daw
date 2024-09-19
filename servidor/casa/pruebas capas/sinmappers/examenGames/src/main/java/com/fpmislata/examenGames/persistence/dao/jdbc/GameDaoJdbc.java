package com.fpmislata.examenGames.persistence.dao.jdbc;

import com.fpmislata.examenGames.domain.entity.*;
import com.fpmislata.examenGames.persistence.dao.GameDao;
import com.fpmislata.examenGames.persistence.dao.jdbc.db.Rawsql;
import com.fpmislata.examenGames.persistence.dao.mapper.*;

import java.sql.ResultSet;
import java.util.List;

public class GameDaoJdbc implements GameDao {
    public List<Game> findAll() {
        String sql = "select * from games g inner join directors d on g.director=d.id";
        ResultSet resultSet = Rawsql.select(sql, null);
        return GameMapper.toGameList(resultSet);
    }

    @Override
    public Game findByGameCode(){
        String sql = "";
        ResultSet resultSet= Rawsql.select(sql,)
            return null;
}

    @Override
    public List<Game> findByDirector() {
        return null;
    }

    @Override
    public void insert(Game game) {

    }

}
