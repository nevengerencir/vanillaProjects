package main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("fruits")
public class Fruit {
    @Id
    private Long id;
    private String name;
    private Long personId;

    public Fruit() {}

    public Fruit(String name, Long personId) {
        this.name = name;
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPersonId() {
        return personId;
    }
}