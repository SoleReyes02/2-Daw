package com.fpmislata.examen3eval.common.container;

import com.fpmislata.examen3eval.persistence.dao.CharacterDao;
import com.fpmislata.examen3eval.persistence.dao.jdbc.CharacterDaoJdbc;

public class CharacterIOC {
    public static CharacterDao characterDao;

    public static CharacterDao getCharacterDao() {
        if (characterDao==null){
            characterDao= new CharacterDaoJdbc();
        }
        return characterDao;
    }

    public static void setCharacterDao(CharacterDao characterDao) {
        CharacterIOC.characterDao = characterDao;
    }
}
