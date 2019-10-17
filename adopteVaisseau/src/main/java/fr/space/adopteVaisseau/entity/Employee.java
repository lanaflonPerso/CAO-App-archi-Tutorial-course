package fr.space.adopteVaisseau.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Provide a first name please")
    @Size(max = 50)
    private String firstName;

    @NotEmpty(message = "Provide a last name please")
    @Size(max = 50)
    private String lastName;

    @NotEmpty(message = "Provide a mail  adress please")
    @Size(max = 40)
    private String mail;

    @NotEmpty(message = "Provide a password please")
    private String password;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Client> clients;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Stock stock;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String mail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}