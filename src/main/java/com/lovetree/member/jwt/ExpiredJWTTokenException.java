package com.lovetree.member.jwt;

public class ExpiredJWTTokenException extends RuntimeException {
    public ExpiredJWTTokenException() {
        super("만료된 JWT 토큰입니다.");
    }
}
