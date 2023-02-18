/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author nakng
 */
public class Officeassignment {

    public Officeassignment(int InstructorID, String Location, String TimesTamp) {
        this.InstructorID = InstructorID;
        this.Location = Location;
        this.TimesTamp = TimesTamp;
    }

    public Officeassignment() {
    }

    public int getInstructorID() {
        return InstructorID;
    }

    public void setInstructorID(int InstructorID) {
        this.InstructorID = InstructorID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getTimesTamp() {
        return TimesTamp;
    }

    public void setTimesTamp(String TimesTamp) {
        this.TimesTamp = TimesTamp;
    }
    private int InstructorID;
    private String Location;
    private String TimesTamp;

}
