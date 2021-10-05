package ru.geekbrains.java1.lesson6;

public class Cat extends Animal {

    private static int countCat = 0;

    public Cat (String name) {
        super(name);
        setCountCat();
    }

    public static int getCountCat() {
        return countCat;
    }

    public void setCountCat() {
        countCat += 1;
    }

    public void run (int distance) {
        if (distance > 0 && distance <= 200) {
            System.out.println(super.getName() + " пробежал " + distance + " м.");
        } else if (distance > 200) {
            System.out.println(super.getName() + " не смог пробежать " + distance + " м.");
        } else  if (distance < 0) {
            System.out.println(super.getName() + " не умеет бегать задом наперед");
        } else System.out.println(super.getName() + " не сдвинулся с места");
    }

    public void swim (int distance) {
        System.out.println("Коты не умеют плавать");
    }

}
