package com.fpmislata.examen3eval.domain.service;

import com.fpmislata.examen3eval.domain.entity.Director;

import java.util.List;

public interface DirectorService {
    public List<Director> findAll();

    public Director findById(int id);
}
