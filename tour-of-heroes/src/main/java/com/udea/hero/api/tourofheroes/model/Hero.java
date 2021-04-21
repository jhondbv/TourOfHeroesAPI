package com.udea.hero.api.tourofheroes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="heroes")
public class Hero {



    @Id
    @Column(name="id")
    @SequenceGenerator(name="hero_sequence",sequenceName = "hero_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hero_sequence")
    private Integer id;
    private String name ;

    public Hero(){};
    public Hero(Integer id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
