package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Food;
import seeu.projectjava.project.service.FoodService;

import java.util.List;
import java.util.UUID;

@RestController
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/foods")
    public List<Food> getAllFoods() {
        return foodService.findAll();
    }

    @GetMapping("/food/{id}")
    public Food getOneFood(@PathVariable UUID id) {
        return foodService.findOne(id);
    }

    @PostMapping("/food")
    public Food saveFood(@RequestBody Food food) throws AlreadyExistsException {
        return foodService.save(food);
    }
    @DeleteMapping("/food/{id}")
    public void deleteFood(@PathVariable UUID id) {
        foodService.delete(id);
    }
}