package com.lovetree.member.jwt;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class TokenProviderTest {

    @Test
    void base64Encoder() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String df = passwordEncoder.encode("df");
        System.out.println("df = " + df);
    }

}