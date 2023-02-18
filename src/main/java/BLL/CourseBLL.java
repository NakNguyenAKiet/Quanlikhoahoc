/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CourseDAL;
import DTO.Course;
import java.util.ArrayList;

/**
 *
 * @author nakng
 */
public class CourseBLL {
    CourseDAL course = new CourseDAL();
    public ArrayList<Course> getAllCourse(){
        return course.getAllCourse();
    }
    
}
