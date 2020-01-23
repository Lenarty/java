package seeu.projectjava.project.pojo;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "burger")
public class Burger{
    @Id
    @Type(type = "pg-uuid")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
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

    public UUID getId() {
        return id;
    }

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
