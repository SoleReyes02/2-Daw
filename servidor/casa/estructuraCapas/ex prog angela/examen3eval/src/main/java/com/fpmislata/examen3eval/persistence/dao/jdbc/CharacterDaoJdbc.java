package com.fpmislata.examen3eval.persistence.dao.jdbc;

import com.fpmislata.examen3eval.domain.entity.Character;
import com.fpmislata.examen3eval.persistence.dao.CharacterDao;
import com.fpmislata.examen3eval.persistence.dao.jdbc.db.Rawsql;
import com.fpmislata.examen3eval.persistence.dao.mapper.CharacterMapper;

import java.sql.ResultSet;
import java.util.List;

public class CharacterDaoJdbc implements CharacterDao {

    @Override
    public List<Character> findByGame(int id) {
        String sql = "SELECT * FROM characters c INNER JOIN games_characters gc on c.id=gc.character_id " +
                "WHERE UPPER(gc.game_id) = ?";
        List<Object> params = List.of(id);
        ResultSet resultSet = Rawsql.select(sql,params);
        return CharacterMapper.toCharacterList(resultSet);
    }
}
