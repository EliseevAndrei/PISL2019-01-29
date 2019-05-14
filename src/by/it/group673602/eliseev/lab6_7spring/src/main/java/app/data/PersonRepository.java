package by.it.group673602.eliseev.lab6_7spring.src.main.java.app.data;

import app.domains.Person;
import by.it.group673602.eliseev.lab6_7spring.src.main.java.app.domains.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository
        extends JpaRepository<Person, Integer> {

}
