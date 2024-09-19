package com.fpmislata.examen3eval.persistence.repository.impl;

import com.fpmislata.examen3eval.domain.entity.Director;
import com.fpmislata.examen3eval.persistence.dao.DirectorDao;
import com.fpmislata.examen3eval.persistence.repository.DirectorRepository;

import java.util.List;

public class DirectorRepositoryImpl implements DirectorRepository {
    DirectorDao directorDao;

    public DirectorRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = directorDao;
    }

    @Override
    public List<Director> findAll() {
        return directorDao.findAll();
    }

    @Override
    public Director findById(int id) {
        return directorDao.findById(id);
    }

}
