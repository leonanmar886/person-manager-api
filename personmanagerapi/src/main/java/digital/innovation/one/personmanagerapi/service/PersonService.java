package digital.innovation.one.personmanagerapi.service;

import digital.innovation.one.personmanagerapi.dto.MessageResponseDTO;
import digital.innovation.one.personmanagerapi.entity.Person;
import digital.innovation.one.personmanagerapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID:" + savedPerson.getId())
                .build();
    }
}
