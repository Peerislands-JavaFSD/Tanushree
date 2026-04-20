package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PayrollProcessor {
    private final TaxCalculator taxCalculator;
    private final String companyName;
    private final int fiscalYear;
    private BonusScheme bonusScheme;

    @Autowired
    public PayrollProcessor(
            TaxCalculator taxCalculator,
            @Value("TechCorp Solutions") String companyName,
            @Value("2026") int fiscalYear) {
        this.taxCalculator = taxCalculator;
        this.companyName = companyName;
        this.fiscalYear = fiscalYear;
    }

    @Autowired
    public void setBonusScheme(BonusScheme bonusScheme) {
        this.bonusScheme = bonusScheme;
    }

    public void processSalary(String employeeName, double grossSalary) {
        double tax = taxCalculator.calculateTax(grossSalary);
        double netSalary = grossSalary - tax;

        System.out.println("Company: " + companyName + " | Year: " + fiscalYear);
        System.out.println("Employee: " + employeeName);
        System.out.println("Gross: " + grossSalary + " | Tax: " + tax + " | Net: " + netSalary);
    }

    public void processWithBonus(String employeeName, double grossSalary) {
        processSalary(employeeName, grossSalary);

        if (bonusScheme != null) {
            System.out.println("Bonus: " + bonusScheme.calculateBonus(grossSalary));
        } else {
            System.out.println("No bonus scheme");
        }
    }
}

