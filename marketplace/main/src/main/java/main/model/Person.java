package main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("people")
public class Person {
    @Id
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