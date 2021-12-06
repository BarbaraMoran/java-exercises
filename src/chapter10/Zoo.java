package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        //este perro puede hacer fetch porque el método fetch está dentro de la clase Dog
        rocky.fetch();
        rocky.makeSound();
        //aunque Rocky sea de tipo Dog podría usar el método feed (más abajo) porque sirve para cualquier subclase de Animal
        feed(rocky);

        //Polimorfismo
        Animal sasha = new Dog();
        //sasha es de tipo Animal pero una instancia de Dog. Ejecutará el método makeSound de Dog
        sasha.makeSound();
        feed(sasha);


        //Ahora convertimos a Sasha en un gato
        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);

        //Al ser de tipo Animal, Shasha no tiene acceso a los métodos específicos de Dog ni Cat (fetch, scratch);

        //Casting. Sasha has been casted to Cat type. Sasha sigue siendo de type Animal pero en esta llamada específica llamamos a Sasha y lo hacemos de tipo Cat para que haga algo concreto de Cat.
        ((Cat) sasha).scratch();
    }

    public static void feed(Animal animal) {

        if(animal instanceof Dog){
            System.out.println("Here's your dog food");

        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }

    }

}
