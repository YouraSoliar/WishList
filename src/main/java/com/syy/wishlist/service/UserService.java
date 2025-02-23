package com.syy.wishlist.service;

import com.syy.wishlist.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserByEmail(String email);
    User createUser(User user);
    User updateUser(String email, User updatedUser);
    void deleteUser(String email);
}
