package ru.pirogov.web.DAO;

import org.springframework.stereotype.Repository;
import ru.pirogov.web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getListUsers() {
        TypedQuery<User> userList = entityManager.createQuery("FROM User", User.class);
        return userList.getResultList();
    }

    @Override
    public User getUserById(Long id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void delete(Long id) {
        User user = getUserById(id);
        entityManager.remove(user);
    }
}
