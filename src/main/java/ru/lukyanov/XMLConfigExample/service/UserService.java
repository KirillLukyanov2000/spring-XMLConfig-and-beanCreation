package ru.lukyanov.XMLConfigExample.service;

import lombok.AllArgsConstructor;
import ru.lukyanov.XMLConfigExample.entity.User;
import ru.lukyanov.XMLConfigExample.repo.UserRepo;

import java.util.Optional;
@AllArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public Optional<User> getUserById(Long id) {
        return userRepo.getById(id);
    }
}
