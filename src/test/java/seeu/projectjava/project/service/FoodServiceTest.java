package seeu.projectjava.project.service;


import org.hibernate.annotations.GenericGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Food;

import javax.persistence.GeneratedValue;
import java.util.UUID;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@SpringBootTest
public class FoodServiceTest {
    @Autowired
    private FoodService foodService;

    @Test
    void getAllFoods(){
        assertNotNull(foodService.findAll());
    }
}
