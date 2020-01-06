package seeu.projectjava.project.pojo;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Table( name = "sandwich" )
public class Sandwich extends Food {
    @Id
    @Column( name = "id" )
    private UUID id;

    @JoinColumn(name = "food_id" , referencedColumnName = "id")
    @ManyToOne
    private Food food;

    public Sandwich(){
    };

    public Sandwich(UUID id, Food food) {
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
