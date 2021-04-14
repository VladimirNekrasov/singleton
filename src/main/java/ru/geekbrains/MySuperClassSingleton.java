package ru.geekbrains;

public class MySuperClassSingleton {
    private static MySuperClassSingleton mySuperClassSingleton;
    public String value;

    private MySuperClassSingleton(String value) {
        this.value = value;
    }

    public static MySuperClassSingleton getInstance(String value) {
        if (mySuperClassSingleton == null) {
            mySuperClassSingleton = new MySuperClassSingleton(value);
        }
        return mySuperClassSingleton;
    }
}
