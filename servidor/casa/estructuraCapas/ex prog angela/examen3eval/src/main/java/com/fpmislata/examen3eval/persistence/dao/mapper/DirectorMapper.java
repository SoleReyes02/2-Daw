package com.fpmislata.examen3eval.persistence.dao.mapper;

import com.fpmislata.examen3eval.domain.entity.Director;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorMapper {
    public static Director toDirector(ResultSet resultSet){
        if(resultSet == null) {
            return null;
        }
        try {
            //nombres de las columnas en la bbdd
            return new Director(
                    resultSet.getInt("d.id"),
                    resultSet.getString("d.name"),
                    resultSet.getString("d.biography")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Director> toDirectorList(ResultSet resultSet){
        List<Director> directorList = new ArrayList<>();
        try{
            while(resultSet.next()){
                directorList.add(toDirector(resultSet));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return directorList;
    }
}
