package seeu.projectjava.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.projectjava.project.pojo.Company;

import java.util.List;
import java.util.UUID;

@Repository
public interface CompanyRepository extends CrudRepository <Company, UUID> {
    List<Company> findAll();
    Company findOneById(UUID id);
    Company save(Company company);
    void delete(Company company);
}
