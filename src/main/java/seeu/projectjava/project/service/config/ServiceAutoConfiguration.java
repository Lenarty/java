package seeu.projectjava.project.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seeu.projectjava.project.service.CompanyService;
import seeu.projectjava.project.service.DefaultCompanyService;

@Configuration
public class ServiceAutoConfiguration {
    @Bean
    public CompanyService companyService() {
        return new DefaultCompanyService();
    }
}
