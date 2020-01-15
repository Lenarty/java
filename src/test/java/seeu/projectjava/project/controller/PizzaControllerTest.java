package seeu.projectjava.project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Company;
import seeu.projectjava.project.pojo.Food;
import seeu.projectjava.project.pojo.Pizza;
import seeu.projectjava.project.service.BurgerService;
import seeu.projectjava.project.service.PizzaService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PizzaController.class)
public class PizzaControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private PizzaService pizzaService;

    @Test
    public void getPizzasTest() throws Exception {
        mvc.perform(get("/pizzas"))
                .andExpect(status().isOk());
    }
    @Test
    public void postPizzaTest() throws Exception{
        Company company = new Company(null,"testName");
        Food food = new Food(null,company,"testName",10.99f,"testDescription");
        Pizza pizza = new Pizza(null,food);

        mvc.perform(post("/pizza").contentType(MediaType.APPLICATION_JSON)
                .content(toJson(pizza))).andExpect(status().isOk());
    }
    private String toJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
