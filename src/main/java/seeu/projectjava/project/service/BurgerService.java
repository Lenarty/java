package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.Burger;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BurgerService {

    Optional<Burger> findById(UUID uuid);

    List<Burger> findAll();

    boolean existsById(UUID uuid);
}
