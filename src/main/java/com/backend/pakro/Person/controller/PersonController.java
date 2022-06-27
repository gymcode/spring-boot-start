package com.backend.pakro.Person.controller;

import com.backend.pakro.Person.dao.PersonDAO;
import com.backend.pakro.Person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonController {
    // need to get the dao
    private final PersonDAO personDAO;

    @Autowired
    public PersonController(@Qualifier("dao") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person){
        return personDAO.addPerson(person);
    }

    public List<Person> list(){
        return personDAO.list();
    }

    public Optional<Person> get(UUID id){
        return personDAO.get(id);
    }
}
