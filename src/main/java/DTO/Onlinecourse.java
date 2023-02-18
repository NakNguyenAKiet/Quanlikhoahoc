/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author nakng
 */
public class Onlinecourse {
     private int CourseID;
          private String Url;

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Onlinecourse(int CourseID, String Url) {
        this.CourseID = CourseID;
        this.Url = Url;
    }

    public Onlinecourse() {
    }

}
