package com.nada.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nada.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}