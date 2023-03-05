package org.aop.core;


/*
    An application that displays new rentals
    The rentals are displayed in the standard output as they are added to the underlying database
    1. For this end, the observer pattern is used (new rentals are streamed towards the standard output)
    2. Logging is added to each operation
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(final String[] args) {

        SpringApplication.run(Main.class);
    }
}