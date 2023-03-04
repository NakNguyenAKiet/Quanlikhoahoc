/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class CourseInstructorExtended extends Courseinstructor{

    public String getTitleCourse() {
        return TitleCourse;
    }

    public void setTitleCourse(String TitleCourse) {
        this.TitleCourse = TitleCourse;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    private String TitleCourse;
    private String FirstName;
    private String LastName;
    
}
