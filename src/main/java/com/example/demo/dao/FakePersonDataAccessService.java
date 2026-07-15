package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public class FakePersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }
    
    
}
