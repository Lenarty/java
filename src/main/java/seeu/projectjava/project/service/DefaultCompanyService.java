package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.projectjava.project.pojo.Company;
import seeu.projectjava.project.repository.CompanyRepository;

import java.util.List;
import java.util.UUID;

public class DefaultCompanyService implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findOne(UUID id) {
        return companyRepository.findOneById(id);
    }

    @Override
    public Company save(Company company) {
        //Check if this author already exists!
        Company newCompany = new Company();
        newCompany.setCompany_name(company.getCompany_name());
        return companyRepository.save(newCompany);
    }

    @Override
    public void delete(UUID id) {
        Company company = companyRepository.findOneById(id);
        if (company != null)
        {
            companyRepository.delete(company);
        }
    }
}
