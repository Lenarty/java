package seeu.projectjava.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Pizza;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, UUID> {

    Pizza findOneById(UUID uuid);

    @Override
    boolean existsById(UUID uuid);

    @Override
    List<Pizza> findAll();

    @Override
    void delete(Pizza pizza);

    @Override
    Pizza save(Pizza pizza);
}
