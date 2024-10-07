package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    User readUser(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);

    List<User> getAllUsers();
}
