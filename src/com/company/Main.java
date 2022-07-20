package com.company;

import animal.Aninal;
import animal.Cow;
import animal.Horse;
import animal.Sheep;

public class Main {
    public static void main(String[] args) {

        Sheep sheep1 = new Sheep("барашик Шон", 80, 18, "man");
        Sheep sheep2 = new Sheep("овечка Рин", 65, 20, "wiman");
        Sheep sheep3 = new Sheep("овечка Роуз", 70, 19, "woman");
        Sheep sheep4 = new Sheep("барашик Джонни", 98, 29, "man");

        Cow cow1 = new Cow("корова Джесика", 200, 18, "woman");
        Cow cow2 = new Cow("бык Стефан", 500, 20, "man");
        Cow cow3 = new Cow("корова Элизабет", 260, 23, "woman");
        Cow cow4 = new Cow("бык Джеймс", 550, 25, "man");
        Cow cow5 = new Cow("корова Стейси", 300, 17, "woman");
        Cow cow6 = new Cow("бык Людовик", 600, 23, "man");

        Horse horse1 = new Horse("конь Альберт", 590, 17, "man");
        Horse horse2 = new Horse("лошадка Анджелина", 400, 20, "woman");
        Horse horse3 = new Horse("конь Стиф", 510, 21, "man");

      Farm farm1 = new Farm("Ош", new Sheep[]{sheep1, sheep2, sheep3}, new Cow[]{cow1, cow2, cow3, cow4, cow5}, new Horse[]{horse1, horse2}, "Сыймык");
      Farm farm2 = new Farm("Баткен", new Sheep[]{sheep4}, new Cow[]{cow6}, new Horse[]{horse3}, "Бека");

        System.out.println(farm1);
        System.out.println("-----------------------");
        System.out.println(farm2);
    }
}