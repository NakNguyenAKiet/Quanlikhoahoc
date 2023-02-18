/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author nakng
 */
public class Person {
    private int PersonID;
    private String Firstname;
    private String Lastname;
    private String HireDay;
    private String EnrollmentDate;

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getHireDay() {
        return HireDay;
    }

    public void setHireDay(String HireDay) {
        this.HireDay = HireDay;
    }

    public String getEnrollmentDate() {
        return EnrollmentDate;
    }

    public void setEnrollmentDate(String EnrollmentDate) {
        this.EnrollmentDate = EnrollmentDate;
    }

    public Person(int PersonID, String Firstname, String Lastname, String HireDay, String EnrollmentDate) {
        this.PersonID = PersonID;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.HireDay = HireDay;
        this.EnrollmentDate = EnrollmentDate;
    }

    public Person() {
    }


}
