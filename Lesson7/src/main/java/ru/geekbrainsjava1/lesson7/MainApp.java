package ru.geekbrainsjava1.lesson7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        Plate plate = new Plate(100);
        cat[0] = new Cat("Мурзик", 10);
        cat[1] = new Cat("Васька", 20);
        cat[2] = new Cat("Афоня", 30);
        cat[3] = new Cat("Бес", 50);
        cat[4] = new Cat("Пуля", 10);

        plate.info();
        cat[0].eat(plate);
        cat[0].info();
        plate.info();
        cat[1].eat(plate);
        cat[1].info();
        plate.info();
        cat[2].eat(plate);
        cat[2].info();
        plate.info();
        cat[3].eat(plate);
        cat[3].info();
        plate.info();
        cat[4].eat(plate);
        cat[4].info();
        plate.info();
        plate.increaseFood(20);
        plate.info();
        cat[3].eat(plate);
        cat[3].info();
        plate.info();
    }
}
