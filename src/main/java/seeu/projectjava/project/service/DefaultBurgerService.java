package seeu.projectjava.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import seeu.projectjava.project.pojo.AlreadyExistsException;
import seeu.projectjava.project.pojo.Burger;
import seeu.projectjava.project.pojo.Food;
import seeu.projectjava.project.repository.BurgerRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DefaultBurgerService implements BurgerService {
    @Autowired
    public BurgerRepository burgerRepository;

    @Override
    public Burger findOne(UUID id) {
        return burgerRepository.findOneById(id);
    }

    @Override
    public List<Burger> findAll() {
        return burgerRepository.findAll();
    }

    @Override
    public boolean existsById(UUID id) {
        if (burgerRepository.existsById(id)) {
            return true;
        }
        return false;
    }

    @Override
    public void delete(UUID id) {
        Burger burger = burgerRepository.findOneById(id);
        if (burger != null) {
            burgerRepository.delete(burger);
        }
    }

    @Override
    public Burger save(Burger burger) throws AlreadyExistsException {
        if (!burgerRepository.existsById(burger.getId())) {
            Burger newBurger = new Burger();
            newBurger.setId(burger.getId());
            newBurger.setFood(burger.getFood());
            return burgerRepository.save(newBurger);
        } else {
            throw new AlreadyExistsException();
        }
    }
}
