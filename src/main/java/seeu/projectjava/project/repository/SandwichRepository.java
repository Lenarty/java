package seeu.projectjava.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Sandwich;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SandwichRepository extends CrudRepository<Sandwich, UUID> {

    Sandwich findOneById(UUID uuid);

    @Override
    boolean existsById(UUID uuid);

    @Override
    List<Sandwich> findAll();

    @Override
    void delete(Sandwich sandwich);

    @Override
    Sandwich save(Sandwich sandwich);
}
