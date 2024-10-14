package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();
    @Override
    public void createUsersTable() {
        userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao = new UserDaoJDBCImpl();
        userDao.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        userDao = new UserDaoJDBCImpl();
        userDao.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) {
        userDao = new UserDaoJDBCImpl();
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {

        userDao = new UserDaoJDBCImpl();
        return userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        userDao = new UserDaoJDBCImpl();
        userDao.cleanUsersTable();
    }
}
