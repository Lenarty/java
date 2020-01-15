package seeu.projectjava.project.service;

import org.hibernate.annotations.GenericGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seeu.projectjava.project.pojo.Company;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@SpringBootTest
class CompanyServiceTest {

    @Autowired
    private CompanyService companyService;

    @Test
    void getAllCompanies(){
        assertNotNull(companyService.findAll());
    }

    @Test
    void saveCompany(){
        assertNotNull(companyService.save(new Company(null, "Test Name")));
    }
}