package ru.geekbrainsjava1.lesson5;

public class MainClass {
    public static void  main (String[] args) {
        Employee[] emplArr = new Employee[5];
        emplArr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231233", 30000, 30);
        emplArr[1] = new Employee("Petrov Ivan", "Main engineer", "petivan@mail.com", "89235631277", 80000, 40);
        emplArr[2] = new Employee("Keda Non", "True worker", "kedaN@mail.com", "89285633477", 40000, 40);
        emplArr[3] = new Employee("Vigo Atas", "Not true worker", "VigoA@mail.com", "89295463747", 90000, 25);
        emplArr[4] = new Employee("Fane", "undead", "Fane@mail.com", "89296664455", 666000, 5000);
        for(int i = 0; i < 5; i++) {
            if (emplArr[i].getAge() > 40) {
                emplArr[i].info();
            }
        }
    }
}
