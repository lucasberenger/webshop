package com.webservice.Shop.config;

import com.webservice.Shop.entities.User;
import com.webservice.Shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Jorge", "Jorge@io.com","12345678", "0987");
        User u2 = new User(null, "Maria", "Maria@io.com","12235578", "1234");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
