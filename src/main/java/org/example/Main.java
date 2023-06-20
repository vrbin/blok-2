package org.example;

public class Main {
    public static void main(String[] args) {
/*
        Car mojeAuto = new Car("Opel", "Astra H", 2006);
        System.out.println("Driv jsem mel " + mojeAuto.getMake() + " " + mojeAuto.getModel() + " vyrobeny " + mojeAuto.getYear());
        mojeAuto.setModel("Astra K");
        mojeAuto.setYear(2019);
        System.out.println("Ted mam " + mojeAuto.getMake() + " " + mojeAuto.getModel() + " vyrobeny " + mojeAuto.getYear());

        Rectangle obda = new Rectangle(12, 9);
        double ploska = obda.getArea();
        System.out.println("Plocha naseho obdelniku je " + ploska);

 */
        Animal psik = new Dog();
        Animal holub = new Bird();
        psik.makeSound();
        psik.move();
        holub.makeSound();
        holub.move();

        PaymentMethod karta = new PaymentMethod.CreditCard();
        PaymentMethod papa = new PaymentMethod.PayPal();
        PaymentMethod penezenka = new PaymentMethod.Cash();
        karta.processPayment(3.50);
        papa.processPayment(123);
        penezenka.processPayment(99);
    }
}