package ru.krasnov;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Say() {
        System.out.println("Я говорю");
    }

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String ageWord;
        if (age % 100 >= 11 && age % 100 <= 14) {
            ageWord = "лет";
        } else {
            switch (age % 10) {
                case 1:
                    ageWord = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    ageWord = "года";
                    break;
                default:
                    ageWord = "лет";
            }
        }

        return String.format(
                "Привет! меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s",
                name, age, ageWord, weight, color
        );
    }
}
