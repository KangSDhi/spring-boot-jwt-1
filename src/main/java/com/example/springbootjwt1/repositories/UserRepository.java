package com.example.springbootjwt1.repositories;

import com.example.springbootjwt1.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email, "123456");
        user.setFirstName("Sigit");
        user.setLastName("Boworaharjo");
        return user;
    }
}
