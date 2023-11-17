package ru.pirogov.web.services;

import ru.pirogov.web.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getListUsers();
    User getUserById(Long id);
    void delete(Long id);
}
