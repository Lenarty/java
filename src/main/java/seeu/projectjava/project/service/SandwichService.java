package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.Sandwich;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SandwichService {

    Optional<Sandwich> findById(UUID uuid);

    boolean existsById(UUID uuid);

    List<Sandwich> findAll();
}
