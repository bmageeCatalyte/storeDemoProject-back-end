package io.catalyte.training.storeDemoProject.repository;

import io.catalyte.training.storeDemoProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
