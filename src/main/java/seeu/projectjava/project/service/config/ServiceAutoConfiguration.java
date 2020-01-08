package seeu.projectjava.project.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seeu.projectjava.project.service.*;

@Configuration
public class ServiceAutoConfiguration {
    @Bean
    public CompanyService companyService() {
        return new DefaultCompanyService();
    }
    @Bean
    public FoodService foodService() {
        return new DefaultFoodService();
    }
    @Bean
    public BurgerService burgerService() {return new DefaultBurgerService();}
    @Bean
    public PizzaService pizzaService() {return new DefaultPizzaService();}
    @Bean
    public SandwichService sandwichService() {return new DefaultSandwichService();}
}
