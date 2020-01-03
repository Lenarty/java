package seeu.projectjava.project.pojo;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "burger")
public class Burger {
    @Id
    @Column( name = "id" )
    private UUID id;

    @Column( name = "name" )
    private String name;

    @Column( name = "price" )
    private Integer price;

    @JoinColumn(name = "companyid" , referencedColumnName = "id")
    @ManyToOne
    private Company company;

    public Burger(){

    };

    public Burger(UUID id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
