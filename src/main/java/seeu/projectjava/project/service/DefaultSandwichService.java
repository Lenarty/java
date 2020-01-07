package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import seeu.projectjava.project.pojo.Sandwich;

import seeu.projectjava.project.repository.SandwichRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultSandwichService implements SandwichService {
    @Autowired
    public SandwichRepository sandwichRepository;

    @Override
    public Optional<Sandwich> findById(UUID id) {
        return sandwichRepository.findById(id);
    }

    @Override
    public boolean existsById(UUID id) {
        if(sandwichRepository.existsById(id)) {return true;}
        return false;
    }

    @Override
    public List<Sandwich> findAll() {
        return sandwichRepository.findAll();
    }
}
