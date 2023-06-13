package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(500);
        boss.setType("Magic");
        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() + "\nBoss type: " + boss.getType());
        System.out.println("----------------------------------");
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero health: " + createHeroes()[i].getHealth() + "\nHero damage: " + createHeroes()[i].getDamage()
                    + "\nHero superpower: " + createHeroes()[i].getSuperPower());
            System.out.println("----------------------------------");
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Medic");
        Hero hero2 = new Hero(100, 15);
        Hero hero3 = new Hero(100, 10, "Magic");
        Hero[] hero = {hero1, hero2, hero3};
        return hero;
    }
}