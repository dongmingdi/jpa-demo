package com.dongmingdi.springboot.repository;

import com.dongmingdi.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 继承JpaRepository来完成对数据库的操作
public interface UserRepostitory extends JpaRepository<User, Integer> {
}
