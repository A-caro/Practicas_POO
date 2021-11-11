package src.poo.colecciones.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class AppCompany {

    public static void main(String[] args) {
        byte cantEmpleadas = 6;

        Employee employee1 = new Employee("Eugenia", "45632106", (byte) 26);
        Employee employee2 = new Employee("Juana", "12365489", (byte) 23);
        Employee employee3 = new Employee("Agustina", "45632158", (byte) 30);
        Employee employee4 = new Employee("Carmen", "45698759", (byte) 28);
        Employee employee5 = new Employee("Nube", "451236587", (byte) 21);
        Employee employee6 = new Employee("Clara", "23569478", (byte) 80);

        ArrayList<Employee> empleadas = new ArrayList<>();
        empleadas.add(employee1);
        empleadas.add(employee2);
        empleadas.add(employee3);
        empleadas.add(employee4);
        empleadas.add(employee5);
        empleadas.add(employee6);

        System.out.println("----Lista de empleadas----");
        reportEmployeeData(empleadas);
        System.out.println("La cantidad de empleadas que tiene la empresa es: " + empleadas.size());


        ArrayList empleadasMenores30 = getFromEmployeesLessThanThirty(empleadas);
        System.out.println("\n----Lista de empleadas menores a 30 años----");
        reportEmployeeData(empleadasMenores30);
        System.out.println("La cantidad de empleadas menores de 30 es " + empleadasMenores30.size());
    }

    //recorremos el array list con el for each
    public static void reportEmployeeData(ArrayList<Employee> empleadas) {
        for (Employee employee : empleadas) {
            System.out.println(employee);
        }
    }

    public static ArrayList getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {
        ArrayList<Employee> employeesLessThanThirty = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getEdad() < 30){
                employeesLessThanThirty.add(employee);
            }
        }
        return employeesLessThanThirty;
    }
}
