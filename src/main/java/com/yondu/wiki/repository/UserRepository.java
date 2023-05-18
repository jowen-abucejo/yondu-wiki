package com.yondu.wiki.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yondu.wiki.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * from users WHERE is_active=1 AND (email=:username OR username=:username) LIMIT 1", nativeQuery = true)
    Optional<User> findByEmailOrUsernameAndIsActive(String username);
}
