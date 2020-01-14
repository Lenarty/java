package seeu.projectjava.project.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import seeu.projectjava.project.service.CompanyService;

@RunWith(SpringRunner.class)
@WebMvcTest(CompanyController.class)
public class CompanyControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CompanyService companyService;

    @Test
    public void getCompanyTest() throws Exception {
        mvc.perform(get("/companies"))
                .andExpect(status().isOk());
    }
}
