package ru.geekbrains.java1.lesson6;

public class Animal {

    private String name;
    private static int countAnimal = 0;

    public Animal (String name) {
        this.name = name;
        setCountAnimal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public void setCountAnimal() {
        countAnimal += 1;
    }

    public void run (int distance) {
        System.out.println(name + " пробежало " + distance + " м.");
    }

    public void swim (int distance) {
        System.out.println(name + " проплыло " + distance + " м.");
    }

}
