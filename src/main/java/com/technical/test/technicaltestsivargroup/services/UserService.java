package com.technical.test.technicaltestsivargroup.services;

import com.technical.test.technicaltestsivargroup.entities.UserEntity;
import com.technical.test.technicaltestsivargroup.exeptions.DuplicateEntityException;
import com.technical.test.technicaltestsivargroup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserEntity saveUser(UserEntity user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new DuplicateEntityException("User with email " + user.getEmail() + " already exists.");
        }
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserEntity updateUser(UserEntity user) {
        return userRepository.save(user);
    }
}
