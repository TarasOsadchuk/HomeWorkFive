package com.geekbrains;

public class Employee {

    private final String name;
    private String position;
    private String email;
    private long number;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, long number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.println("ФИО: " + name + "\n" + "Должность: " + position + "\n" + "Email: " + email + "\n"
                + "Телефон: " + number + " \n" + "Зарплата: " + salary + "\n" + "Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
