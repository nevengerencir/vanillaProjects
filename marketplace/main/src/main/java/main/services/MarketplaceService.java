package main.services;

import main.model.Fruit;
import main.model.Person;
import org.springframework.stereotype.Service;
import main.repositories.MarketplaceRepository;
@Service
public class MarketplaceService {
    private final MarketplaceRepository marketplaceRepository;

    public MarketplaceService(MarketplaceRepository marketplaceRepository) {
        this.marketplaceRepository = marketplaceRepository;
    }

    public void AddPerson(Person person){
        marketplaceRepository.addPerson(person.getName());
        for(Fruit fruit : person.getFruits()){
            marketplaceRepository.addFruit(fruit.getName(), person.getName());
        }
    }
}
