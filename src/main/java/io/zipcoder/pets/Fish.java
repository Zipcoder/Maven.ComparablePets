package io.zipcoder.pets;

public class Fish extends Pet {
    public Fish(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Blub blub";
    }
}
