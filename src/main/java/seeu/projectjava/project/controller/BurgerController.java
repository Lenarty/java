package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Company;
import seeu.projectjava.project.pojo.Food;
import seeu.projectjava.project.service.BurgerService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class BurgerController {

    @Autowired
    public BurgerService burgerService;

    @GetMapping("/burgers")
    public List<Burger> getAllBurgers(){
        return burgerService.findAll();
    }

    @GetMapping("/burger/{id}")
    public Burger getBurger(@PathVariable UUID id){
        return burgerService.findOne(id);
    }

    @GetMapping("/findburger/{id}")
    public boolean burgerExists(@PathVariable UUID id){
        return burgerService.existsById(id);
    }

    @PostMapping("/burger")
    public Burger saveBurger(@RequestBody Burger burger) throws AlreadyExistsException {
        return burgerService.save(burger);
    }

    @DeleteMapping("/burger/{id}")
    public void deleteBurger(@PathVariable UUID id) {
        burgerService.delete(id);
    }
}
