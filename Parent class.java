class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void makeSound(int numBarks) {
        for (int i = 0; i < numBarks; i++) {
            System.out.println("Dog barks");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println("Method Overriding Example:");
        animal.makeSound(); 
        dog.makeSound();   

        System.out.println("\nMethod Overloading Example:");
        dog.makeSound(3);  
    }
}
