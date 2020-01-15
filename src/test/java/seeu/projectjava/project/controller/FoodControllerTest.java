package seeu.projectjava.project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import seeu.projectjava.project.pojo.Company;
import seeu.projectjava.project.pojo.Food;
import seeu.projectjava.project.service.FoodService;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(FoodController.class)
public class FoodControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private FoodService foodService;

    @Test
    public void getFoodTest() throws Exception{
        mvc.perform(get("/foods")).andExpect(status().isOk());
    }
    @Test
    public void postFoodTest() throws Exception{
        Company company = new Company(null,"testName");
        Food food = new Food(null
                ,company,"testName",10.99f,"testDescription");

        mvc.perform(post("/food").contentType(MediaType.APPLICATION_JSON)
                .content(toJson(food))).andExpect(status().isOk());
    }
    private String toJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
