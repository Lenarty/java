package seeu.projectjava.project.pojo;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "food")
public class Food {
    @Id
    @Column( name = "id" )
    private UUID id;

    @JoinColumn(name = "company_id" , referencedColumnName = "id")
    @ManyToOne
    private UUID company_id;

    @Column( name = "food_name")
    private String food_name;

    @Column ( name = "food_price")
    private Float food_price;

    @Column ( name = "food_description")
    private String food_description;

    public Food() {

    }

    public Food(UUID id, UUID company_id, String food_name, Float food_price, String food_description) {
        this.id = id;
        this.company_id = company_id;
        this.food_name = food_name;
        this.food_price = food_price;
        this.food_description = food_description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCompany_id() {
        return company_id;
    }

    public void setCompany_id(UUID company_id) {
        this.company_id = company_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public Float getFood_price() {
        return food_price;
    }

    public void setFood_price(Float food_price) {
        this.food_price = food_price;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }
}