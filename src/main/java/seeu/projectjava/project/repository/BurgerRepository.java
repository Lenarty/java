package seeu.projectjava.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.projectjava.project.pojo.Burger;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, UUID> {
    @Override
    Optional<Burger> findById(UUID uuid);

    @Override
    List<Burger> findAll();

    @Override
    boolean existsById(UUID uuid);
}
