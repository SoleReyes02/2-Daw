package com.fpmislata.examen3eval.persistence.dao.mapper;

import com.fpmislata.examen3eval.domain.entity.Director;
import com.fpmislata.examen3eval.domain.entity.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterMapper {
    public static Character toCharacter(ResultSet resultSet){
        if(resultSet == null) {
            return null;
        }
        try {
            //nombres de las columnas en la bbdd
            return new Character(
                    resultSet.getInt("c.id"),
                    resultSet.getString("c.name"),
                    resultSet.getString("c.role"),
                    resultSet.getString("c.description")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Character> toCharacterList(ResultSet resultSet){
        List<Character> characterList = new ArrayList<>();
        try{
            while(resultSet.next()){
                characterList.add(toCharacter(resultSet));
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return characterList;
    }
}
