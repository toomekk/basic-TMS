package com.example.basictms.entity.enums;

public enum SalaryType {
    BASIC(5500),
    MEDIUM(7000),
    HIGH(9000),
    DISCRETIONARY_BONUS(1000);

    private long grossSalary;
    SalaryType(long grossSalary){this.grossSalary=grossSalary;}
}
