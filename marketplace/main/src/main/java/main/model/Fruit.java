package main.model;



public class Fruit {
    private Long id;
    private String name;
    private Long people_key;

    public Fruit() {}

    public Fruit(String name, Long personId) {
        this.name = name;
        this.people_key = personId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPeople_key() {
        return people_key;
    }

    public void setPeople_key(Long people_key) {
        this.people_key = people_key;
    }
}