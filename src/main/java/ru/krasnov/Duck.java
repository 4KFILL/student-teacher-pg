package ru.krasnov;

public class Duck extends Animal implements Flying{
    @Override
    public void Say() {
        System.out.println("Кря");
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setName("Duck");
        duck.setAge(12);
        duck.setColor("red");
        duck.setWeight(15);
        duck.Fly();
        duck.Say();
    }
}
