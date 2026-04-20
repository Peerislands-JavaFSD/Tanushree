# Payrollproject

Simple Spring XML payroll demo.

## Run

```bash
mvn compile
mvn dependency:build-classpath -Dmdep.outputFile=cp.txt
CP=$(cat cp.txt)
java -cp "target/classes:$CP" org.example.Main
```

Expected output:

```text
Company: TechCorp Solutions | Year: 2026
Employee: Arun
Gross: 80000.0 | Tax: 16000.0 | Net: 64000.0
Bonus: 8000.0
```

