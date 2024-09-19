package com.fpmislata.examen3eval.persistence.dao;

import com.fpmislata.examen3eval.domain.entity.Character;

import java.util.List;

public interface CharacterDao {
    public List<Character> findByGame(int id);
}
