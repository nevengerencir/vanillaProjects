package main.repositories;

import main.model.Fruit;
import main.model.Person;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MarketplaceRepository extends CrudRepository<Person, Long> {
    @Modifying
    @Query("INSERT INTO person values (:person)")
    public void addPerson(String person);
    @Modifying
    @Query("INSERT INTO fruit (fruit_name,person) values (:fruit,:person)")
    public void addFruit(String fruit, String person);


}
