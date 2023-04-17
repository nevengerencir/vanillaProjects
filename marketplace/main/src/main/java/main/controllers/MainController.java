package main.controllers;

import main.model.Person;
import main.repositories.MarketplaceRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
