package main.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.MarketplaceRepository;

@RestController
public class MainController {
    private final MarketplaceRepository marketplaceRepository;

    public MainController(MarketplaceRepository marketplaceRepository) {
        this.marketplaceRepository = marketplaceRepository;
    }

    @PostMapping("/person")

}
