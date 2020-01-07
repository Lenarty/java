package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.projectjava.project.pojo.Pizza;
import seeu.projectjava.project.repository.PizzaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultPizzaService implements PizzaService {
    @Autowired
    public PizzaRepository pizzaRepository;

    @Override
    public Optional<Pizza> findById(UUID id) {
        return pizzaRepository.findById(id);
    }

    @Override
    public boolean existsById(UUID id) {
        if(pizzaRepository.existsById(id)) {return true;}
        return false;
    }

    @Override
    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }
}
