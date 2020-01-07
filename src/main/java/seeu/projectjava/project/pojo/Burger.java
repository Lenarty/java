package seeu.projectjava.project.pojo;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "burger")
public class Burger extends Food {
    @Id
    @Column( name = "id" )
    private UUID id;

    @JoinColumn(name = "food_id" , referencedColumnName = "id")
    @ManyToOne
    private Food food;

    public Burger() {

    }

    public Burger(UUID id, Food food) {
        this.id = id;
        this.food = food;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
