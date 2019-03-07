package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/1/8 0008.
 */
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
