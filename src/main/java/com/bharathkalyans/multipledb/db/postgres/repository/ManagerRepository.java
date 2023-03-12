package com.bharathkalyans.multipledb.db.postgres.repository;

import com.bharathkalyans.multipledb.db.postgres.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
