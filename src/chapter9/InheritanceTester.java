package chapter9;

import java.util.concurrent.SynchronousQueue;

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");

        Employee employee = new Employee();

        employee.setAge(50);
        employee.setGender("H");
        employee.setEmployeeId("1");
        employee.setTitle("camarero");

        System.out.println("El empleado se llama "+ employee.getName()+ " y tiene " + employee.getAge() +
                ". Su sexo es " + employee.getGender() + " y trabaja como " + employee.getTitle() +
                ". Su id de empleado es el " + employee.getEmployeeId());

    }
}