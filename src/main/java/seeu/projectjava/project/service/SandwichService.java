package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Sandwich;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SandwichService {

    Sandwich findOneById(UUID uuid);

    boolean existsById(UUID uuid);

    List<Sandwich> findAll();

    void delete(UUID id);

    Sandwich save(Sandwich sandwich) throws AlreadyExistsException;
}
