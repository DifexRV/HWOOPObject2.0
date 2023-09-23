package org.example;

import org.example.Hogwarts.*;

import java.sql.SQLOutput;

public class Main {

    public static void printSeparation() {
        System.out.println("_________________________________________________________________________________________________________________________________________________________");
    }

    public static void main(String[] args) {


        //в задаче намеренно отказался от массивов, так как массив ограничивает возможность появления новых студентов на факультете

        System.out.println("♥ Факультет Гриффиндор ♥");
        Gryffindor GfStudent1 = new Gryffindor("Гарри Поттер", "Гриффиндор", 73, 67, 77, 75, 76);
        Gryffindor GfStudent2 = new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 71, 70, 68, 67, 66);
        Gryffindor GfStudent3 = new Gryffindor("Рон Уизли", "Гриффиндор", 66, 63, 76, 75, 69);
        System.out.println(GfStudent1);
        System.out.println(GfStudent2);
        System.out.println(GfStudent3);
        printSeparation();


        System.out.println("☼ Факультет Пуффендуй ☼");
        Hufflepuff HpStudent1 = new Hufflepuff("Захария Смит", "Пуффендуй", 45, 53, 73, 80, 84);
        Hufflepuff HpStudent2 = new Hufflepuff("Седрик Диггори", "Пуффендуй", 68, 70, 79, 88, 90);
        Hufflepuff HpStudent3 = new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 47, 53, 67, 66, 69);
        System.out.println(HpStudent1);
        System.out.println(HpStudent2);
        System.out.println(HpStudent3);
        printSeparation();

        System.out.println("◙ Факультет Когтевран ◙");
        Ravenclaw RcStudent1 = new Ravenclaw("Чжоу Чанг", "Когтевран", 53, 51, 80, 77, 84, 72);
        Ravenclaw RcStudent2 = new Ravenclaw("Падма Патил", "Когтевран", 45, 49, 74, 76, 76, 69);
        Ravenclaw RcStudent3 = new Ravenclaw("Джастин Финч-Флетчли", "Когтевран", 47, 48, 69, 67, 68, 66);
        System.out.println(RcStudent1);
        System.out.println(RcStudent2);
        System.out.println(RcStudent3);
        printSeparation();

        System.out.println("§ Факультет Слизерин §");
        Slytherin SlStudent1 = new Slytherin("Драко Малфой", "Слизерин", 69, 70, 81, 82, 84, 77, 88);
        Slytherin SlStudent2 = new Slytherin("Грэхэм Монтегю", "Слизерин", 46, 49, 62, 65, 64, 57, 59);
        Slytherin SlStudent3 = new Slytherin("Грегори Гойл", "Слизерин", 43, 46, 57, 62, 61, 54, 53);
        System.out.println(SlStudent1);
        System.out.println(SlStudent2);
        System.out.println(SlStudent3);
        printSeparation();

        //Задание 3.
        System.out.println("Задание 3");
        System.out.println(((Gryffindor) GfStudent1).comparison((Gryffindor) GfStudent2));
        System.out.println(((Hufflepuff) HpStudent2).comparison((Hufflepuff) HpStudent3));
        System.out.println(((Ravenclaw) RcStudent1).comparison((Ravenclaw) RcStudent3));
        System.out.println(((Slytherin) SlStudent1).comparison((Slytherin) SlStudent3));

        System.out.println("Задание 4");
        System.out.println(((Gryffindor) GfStudent1).comparison((Slytherin) SlStudent1));
        System.out.println(((Ravenclaw)RcStudent1).comparison((Hufflepuff)HpStudent2));

    }


}