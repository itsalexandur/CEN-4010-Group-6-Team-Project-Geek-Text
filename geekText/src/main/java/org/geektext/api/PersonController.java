package org.geektext.api;

import java.util.List;
import java.util.UUID;

import org.geektext.model.Person;
import org.geektext.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("person")
    public void addPerson(@RequestBody Person person){
        try {
            personService.addPerson(person);
        } catch (Exception e){
            System.out.println(e);
        }
    }

  /*  @PostMapping("person/")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
   */
    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }
    }
