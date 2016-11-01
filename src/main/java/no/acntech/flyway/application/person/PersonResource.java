package no.acntech.flyway.application.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonResource {

    private PersonRepository personRepository;

    @Autowired
    public PersonResource(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/person")
    public List<Person> findAll() {

        return personRepository.findAll();
    }

}
