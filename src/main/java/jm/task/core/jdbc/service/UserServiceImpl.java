package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDao.createUsersTable();
        System.out.println("Таблица пользователей создана" + "\n" + "...........");
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
        System.out.println("Таблица пользователей удалена" + "\n" + "...........");
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("Пользователь " + name + " " + lastName + " добавлен в базу данных" + "\n" + "...........");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("Пользователь с id : " + id + " удален из базы данных" + "\n" + "...........");
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        System.out.println("Таблица пользователей очищена" + "\n" + "...........");
        userDao.cleanUsersTable();
    }
}
