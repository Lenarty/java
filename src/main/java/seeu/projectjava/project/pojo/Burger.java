package seeu.projectjava.project.pojo;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "burger")
public class Burger extends Food {
    @Id
    @Column( name = "id" )
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private UUID food_id;

    public Burger() {

    }

    public Burger(UUID id, UUID company_id, String food_name, Float food_price, String food_description, UUID burger_id, UUID food_id) {
        super(id, company_id, food_name, food_price, food_description);
        this.id = burger_id;
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
