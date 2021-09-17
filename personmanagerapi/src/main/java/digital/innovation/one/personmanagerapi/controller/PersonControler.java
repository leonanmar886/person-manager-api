package digital.innovation.one.personmanagerapi.controller;

import digital.innovation.one.personmanagerapi.entity.Person;
import digital.innovation.one.personmanagerapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonControler {

    private PersonRepository personRepository;

    @Autowired
    public PersonControler(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public String createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return "Deu certo";
    }

}
