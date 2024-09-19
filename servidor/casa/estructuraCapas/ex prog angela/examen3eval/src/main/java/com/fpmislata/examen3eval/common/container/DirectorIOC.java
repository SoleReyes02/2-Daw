package com.fpmislata.examen3eval.common.container;

import com.fpmislata.examen3eval.domain.service.DirectorService;
import com.fpmislata.examen3eval.domain.service.impl.DirectorServiceImpl;
import com.fpmislata.examen3eval.persistence.dao.DirectorDao;
import com.fpmislata.examen3eval.persistence.dao.jdbc.DirectorDaoJdbc;
import com.fpmislata.examen3eval.persistence.repository.DirectorRepository;
import com.fpmislata.examen3eval.persistence.repository.impl.DirectorRepositoryImpl;

public class DirectorIOC {
    public static DirectorService directorService;
    public static DirectorRepository directorRepository;
    public static DirectorDao directorDao;

    public static DirectorService getDirectorService() {
        if (directorService==null){
            directorService = new DirectorServiceImpl(getDirectorRepository());
        }
        return directorService;
    }

    public static void setDirectorService(DirectorService directorService) {
        DirectorIOC.directorService = directorService;
    }

    public static DirectorRepository getDirectorRepository() {
        if (directorRepository==null){
            directorRepository= new DirectorRepositoryImpl(getDirectorDao());
        }
        return directorRepository;
    }

    public static void setDirectorRepository(DirectorRepository directorRepository) {
        DirectorIOC.directorRepository = directorRepository;
    }

    public static DirectorDao getDirectorDao() {
        if (directorDao==null){
            directorDao = new DirectorDaoJdbc();
        }
        return directorDao;
    }

    public static void setDirectorDao(DirectorDao directorDao) {
        DirectorIOC.directorDao = directorDao;
    }
}
