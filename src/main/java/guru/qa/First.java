package guru.qa;
/*
* Прочитать про диапазоны типов данных для вещественных/чисел с плавающей точкой.
1) Поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
* посмотреть результаты (вывести в консоль);

2) Попробовать вычисления комбинаций типов данных (int и double);

3) Смоделировать свою предметную область из одного-двух классов,
* имеющих поля для хранения данных и методы. Написать в методе main код,
* создающий эти объекты и вызывающий методы.*/

public class First {

    public static void main(String[] args) {
        Coworker first = new Coworker("Alex", "Braun", 30,
                "junior QA", "web-app");
        first.infoAboutCoworker();
        first.getFullName();
        first.changePosition("middle QA");
        first.changeProject("mobile-app");
        first.addAge();
        first.infoAboutCoworker();

        Coworker second = new Coworker("Ben", "Robinson", 25,
                "middle frontend engineer", "mobile-app");
        second.infoAboutCoworker();
        second.changePosition("middle backend engineer");
        second.changeProject("desktop-app");
        second.getFullName();
        second.infoAboutCoworker();
    }
}
