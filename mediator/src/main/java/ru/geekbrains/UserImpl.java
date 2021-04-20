package ru.geekbrains;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name, String position) {
        super(mediator, name, position);
    }

    @Override
    public void send(String message) {
        System.out.println(this.position + " " +  this.name + " написал в супер-чат: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.position + " " + this.name + " получил сообщение: " + message);
    }
}
