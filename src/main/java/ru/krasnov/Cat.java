package ru.krasnov;

public class Cat extends Animal{
    @Override
    public void Say() {
        System.out.println("Мяу");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Cat");
        cat.setAge(5);
        cat.setWeight(7);
        cat.setColor("yellow");
        cat.Say();
    }
}
