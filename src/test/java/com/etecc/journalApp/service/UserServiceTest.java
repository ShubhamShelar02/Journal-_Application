package com.etecc.journalApp.service;

import com.etecc.journalApp.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private  UserRepo userRepo;

    @Test
    public void testFindByUserName(){
        userRepo.findByUserName("ram");
    }
}
