package ru.pirogov.web.DAO;

import ru.pirogov.web.models.User;

import java.util.List;

public interface UserDAO {
    void add(User user);
    List<User> getListUsers();

    User getUserById(Long id);

    void delete(Long id);
}
