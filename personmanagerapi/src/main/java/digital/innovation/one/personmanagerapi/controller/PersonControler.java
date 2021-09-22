package digital.innovation.one.personmanagerapi.controller;

import digital.innovation.one.personmanagerapi.dto.request.PersonDTO;
import digital.innovation.one.personmanagerapi.dto.response.MessageResponseDTO;
import digital.innovation.one.personmanagerapi.exception.PersonNotFoundExeption;
import digital.innovation.one.personmanagerapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundExeption {
        return personService.findById(id);
    }
}
