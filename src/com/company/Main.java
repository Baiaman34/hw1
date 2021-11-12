package com.company;

public class Main {

    public static void main(String[] args) {
        Joseph ObjectA = new Joseph(20, "Joseph", 195, new Stand("Hermet Purple"), HairColor.BROWN);
        Jotaro ObjectB = new Jotaro(17, "Jotaro", 195, new Stand("Star Platinum"), HairColor.BLACK);
        Jotaro ObjectC = new Jotaro(17, "Joske", 188, new Stand("Crazy Diamond"), HairColor.BLUE);

        ObjectA.getInfo();
        System.out.println(ObjectA.Hamon());
        System.out.println("--------------");
        ObjectB.getInfo();
        System.out.println(ObjectB.Hamon());
        System.out.println("--------------");
        ObjectC.getInfo();
        System.out.println(ObjectC.Hamon());




    }
}
