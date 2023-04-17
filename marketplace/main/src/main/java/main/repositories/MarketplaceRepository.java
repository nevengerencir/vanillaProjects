package main.repositories;

import main.model.Fruit;
import main.model.Person;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MarketplaceRepository extends CrudRepository<Person, Long> {
    @Modifying
    @Query("INSERT INTO people (name) values (:name)")
    public Long addPerson(String name);

    @Modifying
    @Query("INSERT INTO fruits (name, person_id) values (:fruit,:person)")
    public void addFruit(@Param("fruit") String fruit, @Param("person") Long person);

    default void SavePersonWithFruits(Person person) {
        Long personId = addPerson(person.getName());

        for (Fruit fruit : person.getFruits()) {
            addFruit(fruit.getName(), personId);
        }
    }

    @Query("SELECT id, name FROM people WHERE id = 1")
    Person findPersonById();

    @Query("SELECT * FROM fruits WHERE person_id = 1")
    List<Fruit> findFruitByPersonId();

    default Person findPersonWithFruitId( ){
        Person person = findPersonById();
        List <Fruit> fruits = findFruitByPersonId();
        person.setFruits(fruits);
        return person;
    }
}


