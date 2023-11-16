package ru.pirogov.web.services;

import ru.pirogov.web.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getListUsers();
    public User getUserById(Long id);
}
