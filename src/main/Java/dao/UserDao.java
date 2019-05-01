package dao;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static final Map<String, User> USERS = new HashMap<>();
    private static UserDao instance;

    private UserDao() {
    }

    public static synchronized UserDao getInstance() {
        if (instance == null) {
            instance = new UserDao();
        }
        return instance;
    }

    public boolean addNewUser(User user) {
        if (user != null && !USERS.containsKey(user.getName())) {
            USERS.put(user.getName(), new User(user.getName(), user.getPassword()));
            return true;
        }
        return false;
    }

    public User getUser(String name) {
        return USERS.get(name);
    }
}
