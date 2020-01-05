package seeu.projectjava.project.pojo;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "pizza" )
public class Pizza extends Food {
    @Id
    @Column( name = "id" )
    private UUID id;

    @JoinColumn(name = "food_id")
    @ManyToOne
    private UUID food_id;

    public Pizza(){

    };

    public Pizza(UUID id, UUID company_id, String food_name, Float food_price, String food_description, UUID pizza_id, UUID food_id) {
        super(id, company_id, food_name, food_price, food_description);
        this.id = pizza_id;
        this.food_id = food_id;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getFood_id() {
        return food_id;
    }

    public void setFood_id(UUID food_id) {
        this.food_id = food_id;
    }
}
