package digital.innovation.one.personmanagerapi.controller;

import digital.innovation.one.personmanagerapi.dto.MessageResponseDTO;
import digital.innovation.one.personmanagerapi.entity.Person;
import digital.innovation.one.personmanagerapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonControler {

    private PersonService personService;

    @Autowired
    public PersonControler(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }


}
