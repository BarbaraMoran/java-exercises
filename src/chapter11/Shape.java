package chapter11;

//Una clase abstracta tiene que tener al menos un método abstracto que implementarán sus hijas.
//No se puede instanciar, pero está pensada para heredar.
public abstract  class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("I am a shape");
    }
}
