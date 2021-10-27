package com.lovetree.member.jwt;

public class IllegalJwtSignatureException extends RuntimeException {
    public IllegalJwtSignatureException() {
        super("허락되지 않은 서명입니다.");
    }
}
