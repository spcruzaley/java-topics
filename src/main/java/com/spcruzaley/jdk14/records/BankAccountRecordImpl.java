package com.spcruzaley.jdk14.records;

public class BankAccountRecordImpl {

    public static void main(String[] args) {
        BankAccountRecord bankAccountRecord =
                new BankAccountRecord("Salvador P. Cruzaley", 12345, 1_000_000);
        print(bankAccountRecord);

        BankAccountRecord bankAccountRecordTwo =
                new BankAccountRecord("Panchito Perez");
        print(bankAccountRecordTwo);
    }

    private static void print(BankAccountRecord bankAccountRecord) {
        System.out.println("------------------------------------");
        System.out.println(bankAccountRecord.accountNumber());
        System.out.println(bankAccountRecord.money());
        System.out.println(bankAccountRecord.name());
        System.out.println(bankAccountRecord);
    }

}
