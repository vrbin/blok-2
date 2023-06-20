package org.example;

public class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Haf! Haf!");
    }

    @Override
    void move() {
        System.out.println("Chodim po dvore...");
    }
}
