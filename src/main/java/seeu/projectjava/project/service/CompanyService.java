package seeu.projectjava.project.service;

import seeu.projectjava.project.pojo.Company;
import java.util.List;
import java.util.UUID;

public interface CompanyService {
    List<Company> findAll();
    Company findOne(UUID id);
    Company save(Company company);
    void delete(UUID id);
}
