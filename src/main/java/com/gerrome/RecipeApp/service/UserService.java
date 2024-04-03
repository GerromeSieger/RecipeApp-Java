package com.gerrome.RecipeApp.service;

import com.gerrome.RecipeApp.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User login(String username, String password);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}