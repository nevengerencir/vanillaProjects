package main.model;



import java.util.List;

public class Person {

    private Long id;
    private String name;
    private List<Fruit> fruits;

    public Person() {}

    public Person(String name, List<Fruit> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
}