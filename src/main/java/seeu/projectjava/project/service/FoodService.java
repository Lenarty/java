package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Food;

import java.util.List;
import java.util.UUID;

public interface FoodService {
    List<Food> findAll();
    Food findOne(UUID id);
    Food save(Food food) throws AlreadyExistsException;
    void delete(UUID id);
    boolean existsById(UUID id);
    void update(UUID id,Food food);
}
