package com.lovetree.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
public class LoginRequest {
    @Size(min = 3, max = 100)
    private String email;
    @Size(min = 3, max = 100)
    private String password;
}
