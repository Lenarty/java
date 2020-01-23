package seeu.projectjava.project.pojo;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CompanyPojoTest {
    private static final String COMPANY_NAME = "TestName";
    @Test
    public void testTheCompanyClass(){
        //COMPANY ID IS NULL BECAUSE IT WILL AUTOMATICALLY BE GENERATED AND WE DO NOT HAVE TO TEST IT
        Company company = new Company(null, COMPANY_NAME);
        assertEquals(company.getCompany_name(), COMPANY_NAME);
    }
}
