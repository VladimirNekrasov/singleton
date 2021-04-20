package ru.geekbrains;

public class SuperChat {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Владимир", "Руководитель отдела");
        User user2 = new UserImpl(mediator, "Дмитрий", "Java разработчик");
        User user3 = new UserImpl(mediator, "Константин", "Менеджер по продажам");
        User user4 = new UserImpl(mediator, "Иван", "Заместитель руководителя отдела");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Чат работает исправно!");

    }
}
