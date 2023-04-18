package main.services;

import main.model.Fruit;
import main.model.People;
import main.repositories.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }


    public Iterable<People> findAllPeople(){
        return  peopleRepository.findAll();
    }

    public Optional<People> findPeople(Long id){
        return peopleRepository.findById(id);
    }
}
