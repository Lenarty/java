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
import seeu.projectjava.project.pojo.*;
import seeu.projectjava.project.service.BurgerService;
import seeu.projectjava.project.service.PizzaService;
import seeu.projectjava.project.service.SandwichService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SandwichController.class)
public class SandwichControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private SandwichService sandwichService;

    @Test
    public void getSandwichesTest() throws Exception {
        mvc.perform(get("/sandwiches"))
                .andExpect(status().isOk());
    }

    @Test
    public void postSandwichTest() throws Exception{
        Company company = new Company(null,"testName");
        Food food = new Food(null,company,"testName",10.99f,"testDescription");
        Sandwich sandwich = new Sandwich(null,food);

        mvc.perform(post("/sandwich").contentType(MediaType.APPLICATION_JSON)
                .content(toJson(sandwich))).andExpect(status().isOk());
    }
    private String toJson(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
