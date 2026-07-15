package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public class PersonDao {
    int insertPerson(UUID id, Person person);

    default int addPerson(Person person){
        return insertPerson(id, person);
    }
    
}
