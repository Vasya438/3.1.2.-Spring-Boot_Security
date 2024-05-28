package ru.kata.spring.boot_security.demo.service;


import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

public interface UserService {

    List<User> getAllUsersList();

    User getUserById(Long id);

    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User findByUserName(String username);

    UserDetails loadUserByUsername(String username);

}
