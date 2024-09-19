package com.fpmislata.examen3eval.persistence.repository;

import com.fpmislata.examen3eval.domain.entity.Director;

import java.util.List;

public interface DirectorRepository {
    public List<Director> findAll();
    public Director findById(int id);
}
