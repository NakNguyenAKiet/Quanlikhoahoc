package BLL;

import DAL.CourseDAL;
import DTO.Course;
import java.util.ArrayList;

public class CourseBLL {
    CourseDAL course = new CourseDAL();
    public ArrayList<Course> getAllCourse(){
        return course.getAllCourse();
    }
}
