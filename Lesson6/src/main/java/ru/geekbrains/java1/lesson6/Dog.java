package ru.geekbrains.java1.lesson6;

public class Dog extends Animal {

    private static int countDog = 0;

    public Dog (String name) {
        super(name);
        setCountDog();
    }

    public static int getCountDog() {
        return countDog;
    }

    public void setCountDog() {
        countDog += 1;
    }

    @Override
    public void run (int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else if (distance > 500) {
            System.out.println(getName() + " не смог пробежать " + distance + " м.");
        } else  if (distance < 0) {
            System.out.println(getName() + " не умеет бегать задом наперед");
        } else System.out.println(getName() + " не сдвинулся с места");
    }

    @Override
    public void swim (int distance) {
        if (distance > 0 && distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else if (distance > 10) {
            System.out.println(getName() + " не смог проплыть " + distance + " м.");
        } else  if (distance < 0) {
            System.out.println(getName() + " не умеет плавать задом наперед");
        } else System.out.println(getName() + " барахтается на месте");
    }

}
