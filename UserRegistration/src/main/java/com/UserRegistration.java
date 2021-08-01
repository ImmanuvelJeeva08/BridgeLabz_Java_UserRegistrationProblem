package com;

public class UserRegistration {

     public boolean FirstNameValidator(String fname){
          String pattern = "^[A-Z][a-z]{2,}$";
          return fname.matches(pattern);
     }

     public boolean LastNameValidator(String lname){
          String pattern = "^[A-Z][a-z]{2,}$";
          return lname.matches(pattern);
     }

     public boolean EmailValidator(String email){
          String pattern = "^[a-z]{3}[.][a-z]{3}[@][a-z]{2}[.][a-z]{2}[.][a-z]{2}$";
          return email.matches(pattern);
     }

     public boolean PhoneNumberValidator(String phoneNumber) {
          String pattern = "^[0-9]{2}[\s][0-9]{10}$";
          return phoneNumber.matches(pattern);
     }

     public boolean CharacterValidator(String name) {
          String pattern = "[A-Za-z]{8,}$";
          return name.matches(pattern);
     }

     public boolean UpperCaseValidator(String name) {
          String pattern = "[A-Za-z]{8,}$";
          return name.matches(pattern);
     }

     public boolean NumberValidator(String number) {
          String pattern = "^[A-Za-z0-9]{8,}$";
          return number.matches(pattern);
     }

     public boolean SpecialCharValidator(String specialChar) {
          String pattern = "^[A-Za-z0-9]*[@#$!*<>][a-z0-9]{2,}$";
          return specialChar.matches(pattern);
     }
}
