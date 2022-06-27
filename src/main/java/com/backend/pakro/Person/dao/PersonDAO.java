package com.backend.pakro.Person.dao;

import com.backend.pakro.Person.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {
    int createPerson(UUID id, Person person);

    // randomly generating the UUID
    default int addPerson(Person person){
     UUID id = UUID.randomUUID();
        return createPerson(id, person);
    }

    Optional<Person> get(UUID id);

    List<Person> list();

    int deletePerson(UUID id);

    int updatePerson(UUID id, Person person);


}
