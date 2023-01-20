package jm.task.core.jdbc;

import jm.task.core.jdbc.service.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 60);
        userService.saveUser("Петр", "Петров", (byte) 40);
        userService.saveUser("Агрипина", "Кузнецова", (byte) 15);

        System.out.println("Список пользователей : " + userService.getAllUsers() + "\n" + "...........");
        userService.removeUserById(2);
        System.out.println("Список пользователей : " + userService.getAllUsers() + "\n" + "...........");
        userService.cleanUsersTable();
        System.out.println("Список пользователей : " + userService.getAllUsers() + "\n" + "...........");
        userService.dropUsersTable();
    }
}
