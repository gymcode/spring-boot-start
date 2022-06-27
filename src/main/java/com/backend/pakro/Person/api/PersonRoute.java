package com.backend.pakro.Person.api;

import com.backend.pakro.Person.controller.PersonController;
import com.backend.pakro.Person.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonRoute {
    private final PersonController personController;

    @Autowired
    public PersonRoute(PersonController personController) {
        this.personController = personController;
    }

    @PostMapping
    public void addPersonRoute(@RequestBody Person person){
        personController.addPerson(person);
    }

    @GetMapping
    public List<Person> listRoute(){
        return personController.list();
    }

    @GetMapping(path = "{id}")
    public Person get(@PathVariable("id") UUID id){
        return personController.get(id).orElse(null);
    }
}
