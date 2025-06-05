package ru.krasnov;

public class Dog extends Animal{
    @Override
    public void Say () {
        System.out.println("Гав");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Dog");
        dog.setAge(12);
        dog.setWeight(10);
        dog.setColor("green");
        dog.Say();
    }
}
