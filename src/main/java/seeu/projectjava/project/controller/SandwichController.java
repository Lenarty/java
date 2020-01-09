package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
}
