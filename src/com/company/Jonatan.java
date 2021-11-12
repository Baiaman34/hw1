package com.company;

public class Jonatan {
    private int age;
    private String name;
    private int height;
    private Stand stand;
    private HairColor color;

    public Jonatan(int age, String name, int height, Stand stand, HairColor color) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.stand = stand;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Stand getStand() {
        return stand;
    }

    public HairColor getColor() {
        return color;
    }

    public void getInfo(){
        System.out.println("Name: " + name +
                " \nAge: " + age +
                " \nHeight: " + height +
                " \nStand: " + stand +
                " \nHair color: " + color);
    }
}
