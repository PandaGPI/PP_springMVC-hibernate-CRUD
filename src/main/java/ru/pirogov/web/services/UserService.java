package ru.pirogov.web.services;

import ru.pirogov.web.models.User;

import java.util.List;

public interface UserService {
    List<User> getListUsers();
}
