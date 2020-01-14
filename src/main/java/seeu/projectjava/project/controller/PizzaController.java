package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Company;
import seeu.projectjava.project.pojo.Pizza;

import seeu.projectjava.project.service.PizzaService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class PizzaController {

        @Autowired
        public PizzaService pizzaService;

        @GetMapping("/pizzas")
        public List<Pizza> getAllPizzas(){
            return pizzaService.findAll();
        }

        @GetMapping("/pizza/{id}")
        public Pizza getPizza(@PathVariable UUID id){
            return pizzaService.findOneById(id);
        }

        @GetMapping("/findpizza/{id}")
        public boolean pizzaExists(@PathVariable UUID id){
            return pizzaService.existsById(id);
        }

        @PostMapping("/pizza")
        public Pizza savePizza(@RequestBody Pizza pizza) throws AlreadyExistsException {
           return pizzaService.save(pizza);
        }

        @DeleteMapping("/pizza/{id}")
        public void deletePizza(@PathVariable UUID id) {
            pizzaService.delete(id);
        }

}
