package ru.pirogov.web.DAO;

import org.springframework.stereotype.Repository;
import ru.pirogov.web.models.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Override
    public List<User> getListUsers() {
        List<User> listUser = new ArrayList<>();
        listUser.add(new User("Grigoriy", "Pirogov", 34, "IT"));
        listUser.add(new User("Ivan", "Pupkin", 25, "Doctor"));
        return listUser;
    }
}
