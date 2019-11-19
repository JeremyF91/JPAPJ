package fr.efrei.JPAPJ.entity;

import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NonNull
    private String name;
    
    @OneToMany(targetEntity = Rent.class, mappedBy =  "rent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Rent> rents = new ArrayList<>();



    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id ){this.id = id;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}