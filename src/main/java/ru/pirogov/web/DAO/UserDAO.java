package ru.pirogov.web.DAO;

import ru.pirogov.web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getListUsers();
}
