package seeu.projectjava.project.pojo;

import org.junit.Test;

import java.util.UUID;

import static junit.framework.TestCase.assertEquals;

public class FoodPojoTest {
    private static final String FOOD_NAME = "TestName";
    private static final Company COMPANY = new Company(null,"TestName");
    private static final Float FOOD_PRICE = 10.99f;
    private static final String FOOD_DESCRIPTION = "TestDescription";
    @Test
    public void testTheCompanyClass(){
        //FOOD ID IS NULL BECAUSE IT WILL AUTOMATICALLY BE GENERATED AND WE DO NOT HAVE TO TEST IT
        Food food = new Food(null,COMPANY,FOOD_NAME,FOOD_PRICE,FOOD_DESCRIPTION);
        assertEquals(food.getCompany(), COMPANY);
        assertEquals(food.getFood_description(), FOOD_DESCRIPTION);
        assertEquals(food.getFood_name(), FOOD_NAME);
        assertEquals(food.getFood_price(), FOOD_PRICE);
    }
}
