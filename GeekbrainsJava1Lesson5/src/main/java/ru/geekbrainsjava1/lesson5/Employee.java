package ru.geekbrainsjava1.lesson5;

import javax.print.DocFlavor;

public class Employee {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Employee (String fio, String post, String email, String tel, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public Employee () {
        this.fio = "Мистер Никто";
        this.post = "Главный по ничему";
        this.email = "Отсутствует";
        this.tel = "00000000000";
        this.salary = 000000;
        this.age = 0;
    }

    public void info() {
        System.out.println("ФИО: " + fio + "; Должность: " + post + "; E-mail: " + email + "; Телефон: " +
                tel + "; З/П: " + salary + "; Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
