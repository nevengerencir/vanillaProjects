package main.repositories;

import main.model.Fruit;
import org.springframework.data.repository.CrudRepository;

public interface FruitsRepository extends CrudRepository<Fruit,Long> {
}
