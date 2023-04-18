package main.services;

import main.model.Fruit;
import main.repositories.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }
    public Iterable<Fruit> findAllFruit(){
        return fruitRepository.findAll();
    }

    public Optional<Fruit> findFruit(Long id){
        return fruitRepository.findById(id);
    }
}
