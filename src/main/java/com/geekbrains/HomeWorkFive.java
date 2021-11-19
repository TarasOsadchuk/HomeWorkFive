package com.geekbrains;

public class HomeWorkFive {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Taras O.V.", "waiter", "tarasosadchuk.v@gmail.com", 987791299L, 20000, 19);
        employees[1] = new Employee("Inna B.V.", "accountant", "inna.viktorivna@gmail.com", 987543345L, 15000, 46);
        employees[2] = new Employee("Max D.B.", "administrator", "mad.max@gmail.com", 965433235L, 30000, 36);
        employees[3] = new Employee("Alla T.M.", "director", "director@gmail.com", 978649533L, 40000, 49);
        employees[4] = new Employee("Roma P.T.", "Bartender", "bartender.for.rest@gmail.com", 984563436L, 25000, 33);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.information();
                System.out.println();
            }
        }
    }
}