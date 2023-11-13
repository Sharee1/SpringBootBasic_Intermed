package jwtauthenication3.jwtauthenication3.repository;

import jwtauthenication3.jwtauthenication3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User ,String> {

    Optional<User> findByEmail(String email);
}

