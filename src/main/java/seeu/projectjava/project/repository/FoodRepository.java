package seeu.projectjava.project.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.projectjava.project.pojo.Food;
import java.util.List;
import java.util.UUID;

@Repository
public interface FoodRepository extends CrudRepository <Food, UUID> {
    List<Food> findAll();
    Food findOneById(UUID id);
    Food save(Food food);
    void delete(Food food);
    boolean existsById(UUID uuid);
}