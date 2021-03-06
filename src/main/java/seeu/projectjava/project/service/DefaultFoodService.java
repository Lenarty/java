package seeu.projectjava.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Food;
import seeu.projectjava.project.repository.FoodRepository;
import java.util.List;
import java.util.UUID;
public class DefaultFoodService implements FoodService{
    @Autowired
    public FoodRepository foodRepository;

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food findOne(UUID id) {
        return foodRepository.findOneById(id);
    }

    @Override
    public Food save(Food food) throws AlreadyExistsException {
            if (!foodRepository.existsById(food.getId())) {
                Food newFood = new Food();
                newFood.setId(food.getId());
                newFood.setFood_name(food.getFood_name());
                newFood.setFood_description(food.getFood_description());
                newFood.setFood_price(food.getFood_price());
                newFood.setCompany(food.getCompany());
                return foodRepository.save(newFood);
            }
            else {
                throw new AlreadyExistsException();
            }
    }

    @Override
    public void delete(UUID id) {
        Food food = foodRepository.findOneById(id);
        if (food != null)
        {
            foodRepository.delete(food);
        }
    }

    @Override
    public boolean existsById(UUID id) {
        if (foodRepository.existsById(id)){
            return true;
        }
        return  false;
    }

    @Override
    public void update(UUID id, Food food) {
        Food currentFood = foodRepository.findOneById(id);
        currentFood.setId(food.getId());
        currentFood.setFood_name(food.getFood_name());
        currentFood.setFood_description(food.getFood_description());
        currentFood.setFood_price(food.getFood_price());
        currentFood.setCompany(food.getCompany());
        foodRepository.save(food);
    }
}
