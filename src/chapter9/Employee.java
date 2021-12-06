package chapter9;

public class Employee extends Person{


    private String employeeId;
    private String title;


    public Employee() {
        //este constructor llama implícitamente al constructor default de Persona (el que va vacío). Si no lo tenemos hay que llamar al super y pasar lo que pide el otro constructor que tengamos
        //la línea super siempre tiene que ir la primera del constructor de la subclase en caso de usarse
        super("angie");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
