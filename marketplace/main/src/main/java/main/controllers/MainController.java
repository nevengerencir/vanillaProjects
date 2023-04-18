package main.controllers;

import main.model.Fruit;
import main.model.People;
import main.services.FruitService;
import main.services.PeopleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
        System.out.println(id);
        return fruitService.findFruit(id);}
    @GetMapping("/peoples")
    public Iterable<People> findAllPeople(){
        return peopleService.findAllPeople();
    }
    @GetMapping("/people")
    public People findPeople(@RequestParam Long id){
        Optional resultPerson = peopleService.findPeople(id);
        People people = new People();
        if (resultPerson.isPresent()){
            System.out.println(people);
             people = (People) resultPerson.get();
        }

       List<Fruit> fruits = fruitService.findFruitWithPeopleId(id);
        people.setFruits(fruits);
        return people;
    }

}
