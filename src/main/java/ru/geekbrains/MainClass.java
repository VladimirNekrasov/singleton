package ru.geekbrains;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("если вы видите прии запуске приложения в консоле 2 одинаковых значения, " +
                "то синглтон работает корректно");
        MySuperClassSingleton singleton = MySuperClassSingleton.getInstance("Значение 1");
        MySuperClassSingleton anotherSingleton = MySuperClassSingleton.getInstance("Значение 2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }

}
