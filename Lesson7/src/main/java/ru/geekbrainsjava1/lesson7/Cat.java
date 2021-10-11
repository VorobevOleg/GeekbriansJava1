package ru.geekbrainsjava1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        this.satiety = p.decreaseFood(appetite);
    }

    public void info() {
        if (this.satiety) {
            System.out.println("Кот: " + this.name + " - сыт");
        } else { System.out.println("Кот: " + this.name + " - голоден"); }
    }
}
