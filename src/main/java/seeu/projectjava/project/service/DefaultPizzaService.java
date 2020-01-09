package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Pizza;
import seeu.projectjava.project.repository.PizzaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultPizzaService implements PizzaService {
    @Autowired
    public PizzaRepository pizzaRepository;

    @Override
    public Pizza findOneById(UUID id) {
        return pizzaRepository.findOneById(id);
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

    @Override
    public void delete(UUID id) {
        Pizza pizza = pizzaRepository.findOneById(id);
        if (pizza != null) {
            pizzaRepository.delete(pizza);
        }
    }

    @Override
    public Pizza save(Pizza pizza) throws AlreadyExistsException {
        if (!pizzaRepository.existsById(pizza.getId())) {
            Pizza newPizza = new Pizza();
            newPizza.setId(pizza.getId());
            newPizza.setFood(pizza.getFood());
            return pizzaRepository.save(newPizza);
        } else {
            throw new AlreadyExistsException();
        }
    }
}

