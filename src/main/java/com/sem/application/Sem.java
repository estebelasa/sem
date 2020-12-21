package com.sem.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    The Problem:
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number
    and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".

 */
@SpringBootApplication
public class Sem {

    static Logger logger = LoggerFactory.getLogger(Sem.class);

    private static Class<Sem> application = Sem.class;

    public static void main(String[] args) {
        logger.info("Start FizzBuzz");
        SpringApplication.run(application, args);
    }
}
