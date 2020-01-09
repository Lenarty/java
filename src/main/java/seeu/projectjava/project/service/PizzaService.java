package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Pizza;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PizzaService {

    Pizza findOneById(UUID id);

    boolean existsById(UUID id);

    List<Pizza> findAll();

    void delete(UUID id);

    Pizza save(Pizza pizza) throws AlreadyExistsException;
}
