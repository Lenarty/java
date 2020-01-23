package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Pizza;
import seeu.projectjava.project.pojo.Sandwich;
import seeu.projectjava.project.service.PizzaService;
import seeu.projectjava.project.service.SandwichService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class SandwichController {
    @Autowired
    public SandwichService sandwichService;

    @GetMapping("/sandwiches")
    public List<Sandwich> getAllSandwiches(){
        return sandwichService.findAll();
    }

    @GetMapping("/sandwich/{id}")
    public Sandwich getSandwich(@PathVariable UUID id){
        return sandwichService.findOneById(id);
    }

    @GetMapping("/findsandwich/{id}")
    public boolean sandwichExists(@PathVariable UUID id){
        return sandwichService.existsById(id);
    }

    @PostMapping("/sandwich")
    public Sandwich saveSandwich(@RequestBody Sandwich sandwich) throws AlreadyExistsException {
        return sandwichService.save(sandwich);
    }

    @DeleteMapping("/sandwich/{id}")
    public void deleteSandwich(@PathVariable UUID id) {
        sandwichService.delete(id);
    }
}
