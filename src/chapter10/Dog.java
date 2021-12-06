package chapter10;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("wau, wau");
    }

    public void fetch(){
        System.out.println("fetch is fun");

    }

}
