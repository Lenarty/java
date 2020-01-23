package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Sandwich;

import seeu.projectjava.project.repository.SandwichRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultSandwichService implements SandwichService {
    @Autowired
    public SandwichRepository sandwichRepository;

    @Override
    public Sandwich findOneById(UUID id) {
        return sandwichRepository.findOneById(id);
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

    @Override
    public void delete(UUID id) {
        Sandwich sandwich = sandwichRepository.findOneById(id);
        if (sandwich != null) {
            sandwichRepository.delete(sandwich);
        }
    }

    @Override
    public Sandwich save(Sandwich sandwich) throws AlreadyExistsException {
        if (!sandwichRepository.existsById(sandwich.getId())) {
            Sandwich newSandwich = new Sandwich();
            newSandwich.setId(sandwich.getId());
            newSandwich.setFood(sandwich.getFood());
            return sandwichRepository.save(newSandwich);
        } else {
            throw new AlreadyExistsException();
        }
    }
}

