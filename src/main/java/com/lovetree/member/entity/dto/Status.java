package com.lovetree.member.entity.dto;

public enum Status {
    BLOCKED, NONE_BLOCKED,
    ;

    public static boolean isBlooked(Status status) {
        return status.equals(BLOCKED);
    }
}
