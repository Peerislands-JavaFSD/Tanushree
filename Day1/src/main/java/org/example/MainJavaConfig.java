package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfig {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PayrollJavaConfig.class)) {
            PayrollProcessor payrollProcessor = context.getBean(PayrollProcessor.class);
            payrollProcessor.processWithBonus("Arun", 80000);
        }
    }
}

