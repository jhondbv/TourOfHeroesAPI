package com.udea.hero.api.tourofheroes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="heroes")
public class Hero {



    @Id
    @Column(name="id")
    private int id;
    private String name ;

    public Hero(){};
    public Hero(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getNumber() {
        return id;
    }
    public void setNumber(int number) {
        this.id = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
