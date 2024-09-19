package com.fpmislata.examen3eval.persistence.dao;

import com.fpmislata.examen3eval.domain.entity.Director;

import java.util.List;

public interface DirectorDao {
    public List<Director> findAll();
    public Director findById(int id);
}
