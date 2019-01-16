package com.leju.springsecurityjwt1.repository;

import com.leju.springsecurityjwt1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,String> {

    User findByUsername(String username);

}
