package com.example.subastas.service;

import com.example.subastas.model.User;
import com.example.subastas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
    List<User> users = userRepository.findAll();
    users.forEach(user -> logger.info("User found: {}", user.getUsername())); // Usando formato recomendado
    return users;
}

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
