package com.fpmislata.examen3eval.domain.service.impl;

import com.fpmislata.examen3eval.common.exceptions.ServiceException;
import com.fpmislata.examen3eval.domain.entity.Director;
import com.fpmislata.examen3eval.domain.service.DirectorService;
import com.fpmislata.examen3eval.persistence.repository.DirectorRepository;

import java.util.List;

public class DirectorServiceImpl implements DirectorService {
    DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public List<Director> findAll() {
        return directorRepository.findAll();
    }

    @Override
    public Director findById(int id) {
        Director director = directorRepository.findById(id);
        if (director==null){
            throw new ServiceException("Este director no existe");
        }
        return director;
    }

}
