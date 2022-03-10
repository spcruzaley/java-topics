package com.spcruzaley.jdk14.records;

import java.util.Objects;

public final class BankAccountImmutable {

    private String name;
    private int accountNumber;
    private long money;

    public BankAccountImmutable() {
    }

    public BankAccountImmutable(String name, int accountNumber, long money) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public long getMoney() {
        return money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountNumber, money);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "BankAccountImmutable{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", money=" + money +
                '}';
    }
}
