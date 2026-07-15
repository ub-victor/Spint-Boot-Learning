package com.example.demo.service;
import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.addPerson(person);
    }

}
