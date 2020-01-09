package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Food;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BurgerService {

    Burger findOne(UUID uuid);

    List<Burger> findAll();

    boolean existsById(UUID uuid);

    void delete(UUID id);

    Burger save(Burger burger) throws AlreadyExistsException;
}
