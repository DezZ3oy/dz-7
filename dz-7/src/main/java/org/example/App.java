package org.example;

public class App {
    public static void main(String[] args) {
        for (SolarSystem planet : SolarSystem.values()) {
            System.out.println("планета- " + planet);
            System.out.println("порядковий номер від Сонця- " + planet.getNumFromSun());
            System.out.println("віддаленість від попередньої планети- " + planet.getDistanceFromPrevious());
            System.out.println("віддаленість від Сонця- " + planet.getDistanceFromSun());
            System.out.println("радіус- " + planet.getRadius());
            System.out.println("попередня планета- " + (planet.getPreviousPlanet()));
            System.out.println("наступна планета- " + (planet.getNextPlanet()));
            System.out.println("-------------------------------");
        }
    }
}
