package com.etecc.journalApp.repository;

import com.etecc.journalApp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, Long> {
    User findByUserName(String userName);

    void deleteByUserName(String userName);
}
