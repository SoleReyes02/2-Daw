package com.fpmislata.examen3eval.persistence.dao.jdbc;

import com.fpmislata.examen3eval.domain.entity.Director;
import com.fpmislata.examen3eval.persistence.dao.DirectorDao;
import com.fpmislata.examen3eval.persistence.dao.jdbc.db.Rawsql;
import com.fpmislata.examen3eval.persistence.dao.mapper.DirectorMapper;
import com.fpmislata.examen3eval.persistence.dao.mapper.GameMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class DirectorDaoJdbc implements DirectorDao {
    @Override
    public List<Director> findAll() {
        String sql = "SELECT * FROM directors d";
        ResultSet resultSet = Rawsql.select(sql, null);
        return DirectorMapper.toDirectorList(resultSet);
    }

    @Override
    public Director findById(int id) {
        try {
            String sql = "SELECT * FROM directors d WHERE id = ?";
            List<Object> params = List.of(id);
            ResultSet resultSet = Rawsql.select(sql, params);
            resultSet.next();
            return DirectorMapper.toDirector(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
