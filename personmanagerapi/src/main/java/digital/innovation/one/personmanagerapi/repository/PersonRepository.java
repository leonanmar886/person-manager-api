package digital.innovation.one.personmanagerapi.repository;

import digital.innovation.one.personmanagerapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
