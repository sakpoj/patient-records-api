package com.steve.patient_records;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String diagnosis;

    public Patient() {}

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
}