package com.backend.pakro.Person.dao;

import com.backend.pakro.Person.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("dao")
public class PersonDAOService implements PersonDAO {

    private static List<Person> database = new ArrayList<>();
    @Override
    public int createPerson(UUID id, Person person) {
        database.add(
               new Person(id, person.getFirstname(), person.getLastname())
        );
        return 1;
    }

    @Override
    public Optional<Person> get(UUID id) {
        return database.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Person> list() {
        return database;
    }

    @Override
    public int deletePerson(UUID id) {
        database.remove(id);
        return 1;
    }

    @Override
    public int updatePerson(UUID id, Person person) {
        return 0;
    }
}
