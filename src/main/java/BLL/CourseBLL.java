package BLL;

import DAL.CourseDAL;
import DTO.Course;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CourseBLL {

    CourseDAL course = new CourseDAL();

    public ArrayList<Course> getAllCourse() {
        return course.getAllCourse();
    }

    public Course getCourseByID(int id) {
        return course.getCourseByID(id);
    }
    
    public ArrayList<Course> getCoursesBySearchFunction(String keyword) {
        return course.getCoursesBySearchFunction(keyword);
    }

    public void displayAllCoursesInTable(JTable table) {
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getAllCourse().stream().map(course -> new Object[]{
            model.getRowCount() + 1,
            course.getCourseID(),
            course.getTilte(),}).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }
    
    public void displayStudentListInTableBySearchFunction(JTable table, String keyWord) {        
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getCoursesBySearchFunction(keyWord).stream().map(course -> new Object[]{
            model.getRowCount()+1,
            course.getCourseID(),
            course.getTilte()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }
}
