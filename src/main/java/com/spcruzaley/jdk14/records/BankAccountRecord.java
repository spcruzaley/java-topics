package com.spcruzaley.jdk14.records;

public record BankAccountRecord(String name, int accountNumber, long money) {

    BankAccountRecord(String name) {
        this(name, -1, 0);
    }
}
