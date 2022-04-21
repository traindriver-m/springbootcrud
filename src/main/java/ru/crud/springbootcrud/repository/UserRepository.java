package ru.crud.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.crud.springbootcrud.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
