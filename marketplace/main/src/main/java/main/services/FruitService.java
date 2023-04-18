package main.services;

import main.model.Fruit;
import main.repositories.FruitsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class FruitService {
    private final FruitsRepository fruitsRepository;

    public FruitService(FruitsRepository fruitsRepository) {
        this.fruitsRepository = fruitsRepository;
    }
    public Iterable<Fruit> findAllFruit(){
        return fruitsRepository.findAll();
    }

    public Optional<Fruit> findFruit(Long id){
        return fruitsRepository.findById(id);
    }
}
