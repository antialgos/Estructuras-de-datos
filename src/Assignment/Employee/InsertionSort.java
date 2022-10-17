package Assignment.Employee;

import java.util.Arrays;

public class InsertionSort<T> {

    public void sort(Comparable<T>[] objects) {
        for (int i = 0; i < objects.length; i++) {
            Comparable<T> current = objects[i];
            int j = i-1;
            while (j >= 0 && objects[j].compareTo((T)current) > 0) {
                objects[j+1] = objects[j];
                j--;
            }
            objects[j+1] = current;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new Employee(10, 5, "Felipe", "Andrade"),
            new Employee(6, 7, "Andres", "Valenzuela"),
            new Employee(8, 3, "Macarena", "Lazcano"),
            new Employee(15, 9, "Denise", "Yañez"),
            new Employee(2, 1, "Chochi", "Mala"),
            new Employee(9, 10, "Manchas", "Gay"),
            new Employee(12, 2, "Matias", "Andrade"),
            new Employee(4, 15, "Gustavo", "Andrade"),
            new Employee(5, 8, "Mario", "Andrade"),
            new Employee(7, 12, "Monica", "Valenzuela")
        };
        InsertionSort<Employee> sorter = new InsertionSort<Employee>();
        sorter.sort(employees);
        System.out.println("Sorted Array");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
