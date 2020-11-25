package com.company.lab6;

import java.util.ArrayList;

abstract class Person {

    String title;
    String givenName;
    String familyName;
    FullName name;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    Phone phone;
    ArrayList<Hospital>Hospitals;
}

class FullName{}
class Gender{}
class Address{}
class Phone{}
class Date{}