package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.repository.BurgerRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultBurgerService implements BurgerService {
    @Autowired
    public BurgerRepository burgerRepository;

    @Override
    public Optional<Burger> findById(UUID id) {
        return burgerRepository.findById(id);
    }

    @Override
    public List<Burger> findAll() {
        return burgerRepository.findAll();
    }

    @Override
    public boolean existsById(UUID id) {
        if(burgerRepository.existsById(id)) {return true;}
        return false;
    }
}
