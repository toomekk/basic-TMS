package com.example.basictms.entity;


import com.example.basictms.entity.enums.SalaryType;
import com.example.basictms.entity.enums.TrailerMark;
import jakarta.persistence.*;

@Entity
@Table(name = "salary")
public class Salary {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private SalaryType salaryType;

}
