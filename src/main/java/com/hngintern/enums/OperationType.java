package com.hngintern.enums;

public enum OperationType {

    ADDITION,
    SUBTRACTION,
    MULTIPLICATION;

    public String value() {
        return name();
    }

    public static OperationType fromValue(String v) {
        return valueOf(v);
    }

    }
