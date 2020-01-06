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
}
