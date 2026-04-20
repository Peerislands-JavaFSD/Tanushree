package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                IncomeTaxCalculator.class,
                PerformanceBonus.class,
                PayrollProcessor.class)) {
            PayrollProcessor payrollProcessor = context.getBean(PayrollProcessor.class);
            payrollProcessor.processWithBonus("Arun", 80000);
        }
    }
}


