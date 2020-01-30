package net.proselyte.jwtappdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;

@SpringBootApplication
public class JwtappdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtappdemoApplication.class, args);
    }

}
