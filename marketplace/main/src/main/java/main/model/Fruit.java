package main.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("fruits")
public class Fruit {
    @Id
    private Long id;
    private String name;
    private Long people_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPeople_id() {
        return people_id;
    }

    public void setPeople_id(Long people_id) {
        this.people_id = people_id;
    }
}