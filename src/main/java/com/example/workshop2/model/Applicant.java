package com.example.workshop2.model;

import java.util.ArrayList;
import java.util.List;

public class Applicant {
    private String name;
    private String phoneNumber;
    private List<String> skills;
    private List<Company> selectedCompanies;

    public Applicant(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.skills = new ArrayList<>();
        this.selectedCompanies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public List<Company> getSelectedCompanies() {
        return selectedCompanies;
    }

    public void addCompany(Company company) {
        selectedCompanies.add(company);
    }
}

