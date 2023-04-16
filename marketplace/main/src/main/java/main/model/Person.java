package main.model;

import java.util.List;

public class Person {
    private List<Fruit> fruits;

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
    public void giveFruit(Fruit fruit){
fruits.remove(fruit);
    }
}
