package org.example;

public class Bird extends Animal{
    @Override
    void makeSound() {
        System.out.println("Vrku! Vrku!");
    }

    @Override
    void move() {
        System.out.println("Litam a seru na vsechno...");
    }
}
