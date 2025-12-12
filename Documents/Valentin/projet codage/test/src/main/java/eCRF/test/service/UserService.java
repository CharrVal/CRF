package eCRF.test.service;

import eCRF.test.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User updateUser(Integer id, User user);
    User getById(Integer id);
    void deleteUserById(Integer id);
}
