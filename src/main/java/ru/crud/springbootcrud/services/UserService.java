package ru.crud.springbootcrud.services;

import ru.crud.springbootcrud.models.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> findAll();

    void delete(Long id);

    User findById(Long id);
}
