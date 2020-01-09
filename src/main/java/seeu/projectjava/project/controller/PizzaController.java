package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
