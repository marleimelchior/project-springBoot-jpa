package com.marleimelchior.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marleimelchior.training.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
