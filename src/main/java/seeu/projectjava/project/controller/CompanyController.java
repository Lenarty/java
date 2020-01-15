package seeu.projectjava.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seeu.projectjava.project.pojo.Company;
import seeu.projectjava.project.service.CompanyService;

import java.util.List;
import java.util.UUID;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        return companyService.findAll();
    }

    @GetMapping("/company/{id}")
    public Company getOneCompany(@PathVariable UUID id) {
        return companyService.findOne(id);
    }

    @PostMapping("/company")
    public Company saveCompany(@RequestBody Company company) {
        return companyService.save(company);
    }

    @DeleteMapping("/company/{id}")
    public void deleteCompany(@PathVariable UUID id) {
        companyService.delete(id);
    }

    @PutMapping("/company/{id}")
    public void updateCompany(@PathVariable UUID id, @RequestBody Company company){
        companyService.update(id,company);
    }
}