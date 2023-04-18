package main.repositories;

import main.model.Fruit;
import main.model.People;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FruitsRepository extends CrudRepository<Fruit,Long> {

    @Query("Select (name) from fruits where people_id = :id")
    public List<Fruit> findFruitsWithPeopleId(Long id);
}
