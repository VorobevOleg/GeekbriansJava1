package ru.geekbrains.java1.lesson6;

public class MainApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Просто животное");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Васька");
        Dog dog = new Dog("Бобик");

        animal.run (900);
        animal.swim(300);

        cat1.run(70);
        cat1.run(300);
        cat1.run(0);
        cat2.swim(30);

        dog.run(400);
        dog.run(700);
        dog.run(0);
        dog.swim(5);

        System.out.println("Количество животных = " + Animal.getCountAnimal());
        System.out.println("Количество кошек = " + Cat.getCountCat());
        System.out.println("Количество собак = " + Dog.getCountDog());
    }
}
