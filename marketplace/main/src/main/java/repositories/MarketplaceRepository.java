package repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface MarketplaceRepository extends CrudRepository {
    @Query("INSERT INTO person (name) values = :name")
    public void addPerson(String person);
}
