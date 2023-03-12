package com.bharathkalyans.multipledb;

import com.bharathkalyans.multipledb.db.mysql.entities.User;
import com.bharathkalyans.multipledb.db.mysql.repository.UserRepository;
import com.bharathkalyans.multipledb.db.postgres.entities.Manager;
import com.bharathkalyans.multipledb.db.postgres.repository.ManagerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultipleDbApplicationTests {


    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    void dbTest() {

        User user = User.builder()
                .userName("Bharath")
                .address("KA")
                .phoneNumber("7996132372")
                .userId(100L)
                .build();

        Manager manager = Manager.builder()
                .userName("Ramesh")
                .address("AP")
                .phoneNumber("7996132372")
                .userId(1212L)
                .build();

        managerRepository.save(manager);
        userRepository.save(user);

    }

}
