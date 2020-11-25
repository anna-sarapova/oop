package com.company.lab6;

import java.util.ArrayList;

public class Patient extends Person{
    String id;
    FullName name;
    Gender gender;
    Date birthDate;
    int age;
    Date accepted;
    History sickness;
    ArrayList<String> prescriptions;
    ArrayList<String> allergies;
    ArrayList<String> specialReqs;
    ArrayList<OperationsStaff> OperationsStaffs;
}

class History{}