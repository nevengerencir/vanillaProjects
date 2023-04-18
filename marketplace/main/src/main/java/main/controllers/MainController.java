package main.controllers;

import main.model.Fruit;
import main.model.People;
import main.services.FruitService;
import main.services.PeopleService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {
    private final FruitService fruitService;
    private final PeopleService peopleService;

    public MainController(FruitService fruitService, PeopleService peopleService) {
        this.fruitService = fruitService;
        this.peopleService = peopleService;
    }

    @GetMapping("/fruits")
    public Iterable<Fruit> findAllFruit(){
    return fruitService.findAllFruit();}
    @GetMapping("/fruit")
    public Optional<Fruit> findFruit(@RequestParam Long id){
        return fruitService.findFruit(id);}
    @GetMapping("/peoples")
    public Iterable<People> findAllPeople(){
        return peopleService.findAllPeople();
    }
    @GetMapping("/people")
    public Optional<People> findPeople(@RequestParam Long id){
        return peopleService.findPeople(id);
    }

}
