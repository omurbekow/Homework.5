package com.company;

public class Main {
    public static void main(String[]args) {
     Boss puma = new Boss();
     puma.setBossHealth(900);
     puma.setBossDamage(85);
     puma.setSuperPower("evasion");
        System.out.println("Здаровие боса: "  + puma.getBossHealth ());
        System.out.println("Урон боса: " + puma.getBossDamage());
        System.out.println("Защита боса: " + puma.getSuperPower());
    }
}
