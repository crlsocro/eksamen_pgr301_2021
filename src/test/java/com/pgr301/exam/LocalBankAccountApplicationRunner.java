package com.pgr301.exam;

import org.springframework.boot.SpringApplication;

public class LocalBankAccountApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountApplication.class, "--spring.profiles.active=test");
    }
}
