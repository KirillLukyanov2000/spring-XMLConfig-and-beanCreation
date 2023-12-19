package ru.lukyanov.XMLConfigExample.repo;

import java.util.Optional;

public interface Repo<T> {
    Optional <T> getById(Long id);
}
