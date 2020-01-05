package seeu.projectjava.project.pojo;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table( name = "company" )
public class Company {
    @Id
    @Column( name = "id" )
    private UUID id;

    @Column( name = "company_name")
    private String company_name;

    public Company(){

    }

    public Company(UUID id, String company_name) {
        this.id = id;
        this.company_name = company_name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}