package ru.pirogov.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pirogov.web.DAO.UserDAO;
import ru.pirogov.web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> getListUsers() {
        return userDAO.getListUsers();
    }
}
