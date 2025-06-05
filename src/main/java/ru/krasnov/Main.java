package ru.krasnov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void animalsFunc() {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        enum ChoiceCommand { ADD, LIST, EXIT }
        enum AnimalsInput { CAT, DOG, DUCK }

        while (flag) {
            System.out.println("Введите команду: add/list/exit");
            ChoiceCommand commandInput = ChoiceCommand.valueOf(scanner.nextLine().strip().toUpperCase());

            switch (commandInput) {
                case ADD:
                    System.out.println("Какое животное: cat/dog/duck");
                    AnimalsInput commandInputAdd = AnimalsInput.valueOf(scanner.nextLine().strip().toUpperCase());
                    switch (commandInputAdd) {
                        case CAT:
                            System.out.println("Укажите имя, возраст, вес и цвет (через пробел):");
                            String[] inputCat = scanner.nextLine().trim().split(" ");
                            Cat catInput = new Cat();
                            catInput.setName(inputCat[0]);
                            catInput.setAge(Integer.parseInt(inputCat[1]));
                            catInput.setWeight(Integer.parseInt(inputCat[2]));
                            catInput.setColor(inputCat[3]);
                            animals.add(catInput);
                            catInput.Say();
                            break;
                        case DOG:
                            System.out.println("Укажите имя, возраст, вес и цвет (через пробел):");
                            String[] inputDog = scanner.nextLine().trim().split(" ");
                            Dog dogInput = new Dog();
                            dogInput.setName(inputDog[0]);
                            dogInput.setAge(Integer.parseInt(inputDog[1]));
                            dogInput.setWeight(Integer.parseInt(inputDog[2]));
                            dogInput.setColor(inputDog[3]);
                            animals.add(dogInput);
                            dogInput.Say();
                            break;
                        case DUCK:
                            System.out.println("Укажите имя, возраст, вес и цвет (через пробел):");
                            String[] inputDuck = scanner.nextLine().trim().split(" ");
                            Duck duckInput = new Duck();
                            duckInput.setName(inputDuck[0]);
                            duckInput.setAge(Integer.parseInt(inputDuck[1]));
                            duckInput.setWeight(Integer.parseInt(inputDuck[2]));
                            duckInput.setColor(inputDuck[3]);
                            animals.add(duckInput);
                            duckInput.Say();
                            duckInput.Fly();
                            break;
                    }
                    break;
                case LIST:
                    for (Object element : animals) {
                        System.out.println(element.toString());
                    }
                    break;
                case EXIT:
                    scanner.close();
                    flag = false;
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main func = new Main();
        func.animalsFunc();
    }
}