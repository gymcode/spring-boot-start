package com.backend.pakro.Person.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String firstname;
    private final String lastname;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("firstName") String firstname, @JsonProperty("lastName") String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // defining our getter for the id, firstname and lastname


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public UUID getId() {
        return id;
    }
}
