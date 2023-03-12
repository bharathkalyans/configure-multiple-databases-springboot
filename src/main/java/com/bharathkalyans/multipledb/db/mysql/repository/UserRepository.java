package com.bharathkalyans.multipledb.db.mysql.repository;

import com.bharathkalyans.multipledb.db.mysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
