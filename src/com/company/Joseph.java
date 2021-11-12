package com.company;

public class Joseph extends Jonatan{
    public Joseph(int age, String name, int height, Stand stand, HairColor color) {
        super(age, name, height, stand, color);
    }

    public String Hamon(){
        return "You are best hamon user";
    }

    public final String Hamon(int age){
        if (age > 14){
            return "ez game";
        }
        return null;
    }
}
