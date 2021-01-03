package com.pk.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

}
