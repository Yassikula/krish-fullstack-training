package com.yasasi.rentcloud.authorizationserver.repository;

import com.yasasi.rentcloud.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String name);

}
