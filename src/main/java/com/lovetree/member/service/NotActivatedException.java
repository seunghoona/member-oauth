package com.lovetree.member.service;

public class NotActivatedException extends RuntimeException {
    public NotActivatedException() {
        super("활성화_되어_있지_않습니다");
    }
}
