package ru.geekbrains;

public abstract class User {
    public ChatMediator mediator;
    public String name;
    public String position;

    public User(ChatMediator mediator, String name, String position) {
        this.mediator = mediator;
        this.name = name;
        this.position = position;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
