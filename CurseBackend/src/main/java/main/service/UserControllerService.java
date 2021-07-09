package main.service;

import main.model.User;

public interface UserControllerService {
    public User findByUsername(User user);
    public boolean saveUser(User user);
}
