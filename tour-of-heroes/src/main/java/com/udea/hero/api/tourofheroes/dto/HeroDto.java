package com.udea.hero.api.tourofheroes.dto;

public class HeroDto {
    
    private int id;
    private String name ;

    public HeroDto(int id,String name)
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
   
