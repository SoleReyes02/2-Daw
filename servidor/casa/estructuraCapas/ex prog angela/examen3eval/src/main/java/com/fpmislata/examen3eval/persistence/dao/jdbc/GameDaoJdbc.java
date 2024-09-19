package com.fpmislata.examen3eval.persistence.dao.jdbc;

import com.fpmislata.examen3eval.domain.entity.Character;
import com.fpmislata.examen3eval.domain.entity.Game;
import com.fpmislata.examen3eval.persistence.dao.GameDao;
import com.fpmislata.examen3eval.persistence.dao.jdbc.db.Rawsql;
import com.fpmislata.examen3eval.persistence.dao.mapper.GameMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GameDaoJdbc implements GameDao {

    @Override
    public List<Game> findAll() {
        String sql = "SELECT * FROM games g INNER JOIN directors d on g.director_id=d.id";
        ResultSet resultSet = Rawsql.select(sql, null);
        return GameMapper.toGameList(resultSet);
    }

    @Override
    public Game findByGameCode(String game_code) {
        try {
            String sql2 = "SELECT * FROM games g INNER JOIN games_characters gc on g.id=gc.game_id " +
                    "inner join characters c on gc.character_id=c.id WHERE UPPER(g.game_code) LIKE UPPER(?)";
            String sql3= "SELECT * FROM games g INNER JOIN directors d on g.director_id=d.id WHERE UPPER(g.game_code) LIKE UPPER(?)";
            //String game_code = "%"+game_code+"%";
            List<Object> params = List.of(game_code);
            ResultSet resultSet = Rawsql.select(sql3, params);
            resultSet.next();
            return GameMapper.toGame(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException("Hay un problema con la bbdd" + e);
        }

    }

    @Override
    public List<Game> findByDirector(int directorId) {
        String sql = "SELECT * FROM games g INNER JOIN directors d on g.director_id=d.id WHERE g.director_id = ?";
        List<Object> params = List.of(directorId);
        ResultSet resultSet = Rawsql.select(sql, params);
        return GameMapper.toGameList(resultSet);
    }

    @Override
    public void insert(Game game) {
        //Insertar un juego en la bbdd
        String sql = "INSERT INTO games (game_code, title, release_year, description, director_id)" +
                " VALUES(?,?,?,?,?)";
        List<Object> params = List.of(game.getGame_code(), game.getTitle(), game.getRelease_year(),
                game.getDescription(), game.getDirector().getId());
        Object object = Rawsql.insert(sql, params);
        //Insertar el listado de personajes del automaticamente en la bbdd
        for (Character character:game.getCharacterList()) {
            String sql2 = "INSERT INTO games_characters (game_id, character_id) VALUES (?,?)";
            List<Object> params2 = List.of(object,character.getId());
            Rawsql.insert(sql2,params2);
        }
    }
}
