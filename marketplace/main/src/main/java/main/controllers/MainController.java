package main.controllers;

import main.model.Person;
import main.services.MarketplaceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    public MainController(MarketplaceService marketplaceService) {
        this.marketplaceService = marketplaceService;
    }

    private final MarketplaceService marketplaceService;
    @PostMapping("/person")
    public void addPerson(@RequestBody Person person){
        marketplaceService.AddPerson(person);

    }

}
