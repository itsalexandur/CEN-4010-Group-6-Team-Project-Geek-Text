package org.geektext.dao;

import org.geektext.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonDataAccessService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person){
        DB.add(new Person(id, person.getFirstName(), person.getLastName()));
                return 0;
    }
}
