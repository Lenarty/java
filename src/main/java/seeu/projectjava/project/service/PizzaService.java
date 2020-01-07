package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.Pizza;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PizzaService {

    Optional<Pizza> findById(UUID id);

    boolean existsById(UUID id);

    List<Pizza> findAll();
}
