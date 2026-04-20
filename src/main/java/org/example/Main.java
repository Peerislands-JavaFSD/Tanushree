package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            PayrollProcessor payrollProcessor = context.getBean(PayrollProcessor.class);
            payrollProcessor.processWithBonus("Arun", 80000);
        }
    }
}