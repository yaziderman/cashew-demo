package com.cashew.user.repository;

import com.cashew.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
}
