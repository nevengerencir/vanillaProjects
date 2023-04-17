package main.controllers;

import main.model.Person;
import main.repositories.MarketplaceRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    private final MarketplaceRepository marketplaceRepository;

    public MainController(MarketplaceRepository marketplaceRepository) {
        this.marketplaceRepository = marketplaceRepository;
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody Person person){
        marketplaceRepository.SavePersonWithFruits(person);

    }
    @GetMapping("/person")
    public Person findPersonWithFruit(){
        return marketplaceRepository.findPersonById();
    };

}
