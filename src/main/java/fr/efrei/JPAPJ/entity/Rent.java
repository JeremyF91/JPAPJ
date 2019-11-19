package fr.efrei.JPAPJ.entity;


import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Rent<Date> {
   /* String pattern = "yyyy-MM-dd"; */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date beginRent;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endRent;

    @ManyToOne
    @NonNull
    private Person person;

    @OneToMany(targetEntity = Person.class, mappedBy =  "Person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Vehicule> Person = new ArrayList<>();
    /* ADD Constraint 0 to many */

    public Rent(int Id, Date beginRent, Date endRent, Person person) {
        this.id=id;
        this.beginRent = beginRent;
        this.endRent = endRent;
        this.person= person;
    }





}