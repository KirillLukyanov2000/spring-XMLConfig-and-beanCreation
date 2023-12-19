package ru.lukyanov.XMLConfigExample.repo;


import lombok.Data;
import ru.lukyanov.XMLConfigExample.entity.User;

import java.util.Map;
import java.util.Optional;
@Data
public class UserRepo implements Repo<User> {

    private Map<Long, User> userMap = Map.of(
            1L, new User("Ivan", "pass1"),
            2L, new User("Vasya", "qwer2")
    );

    public Optional<User> getById(Long id) {
        return Optional.of(userMap.get(id));
    }
}
