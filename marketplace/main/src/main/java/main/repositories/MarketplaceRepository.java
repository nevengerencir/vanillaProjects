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

    @Query("SELECT * FROM people WHERE id = :id")
    Person findPersonById(@Param("id") Long id);

    @Query("SELECT * FROM fruit WHERE id = :personId")
    List<Fruit> findFruitByPersonId(@Param("personId") Long personId);

    default Person findPersonWithFruitId(@Param("id") Long id){
        Person person = findPersonById(id);
        List <Fruit> fruits = findFruitByPersonId(id);
        person.setFruits(fruits);
        return person;
    }
}


