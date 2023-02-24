/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CourseDAL;
import DAL.PersonDAL;
import DAL.StudentgradeDAL;
import DTO.Studentgrade;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOC BAU
 */
public class StudentgradeBLL {

    StudentgradeDAL studentgradeDAL = new StudentgradeDAL();
    CourseDAL courseDAL = new CourseDAL();
    PersonDAL personDAL = new PersonDAL();

    public ArrayList<Studentgrade> getGradeByStudentID(int id) {
        return studentgradeDAL.getGradeByStudentID(id);
    }

    public ArrayList<Studentgrade> getGradeByCourseID(int id) {
        return studentgradeDAL.getGradeByCourseID(id);
    }

    public void displayGradeOfCoursesInTable(JTable table, JLabel studentgrade_studentName_title, int StudentID) {
        if (StudentID == -1) {
            StudentID = personDAL.getAllStudents().get(0).getPersonID();
        }

        studentgrade_studentName_title.setText("COURSE GRADE" + " - " + personDAL.getPersonByID(StudentID).getFullName());
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getGradeByStudentID(StudentID).stream().map(courseGrade -> new Object[]{
            model.getRowCount() + 1,
            courseGrade.getCourseID(),
            courseDAL.getCourseByID(courseGrade.getCourseID()).getTilte(),
            courseGrade.getGrade()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }
    
    public void displayGradeOfStudentInTable(JTable table, JLabel studentgrade_courseName_ltitle, int courseID) {
        if (courseID == -1) {
            courseID = courseDAL.getAllCourse().get(0).getCourseID();
        }

        studentgrade_courseName_ltitle.setText("STUDENT GRADE" + " - " + courseDAL.getCourseByID(courseID).getTilte());
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getGradeByCourseID(courseID).stream().map(studentGrade -> new Object[]{
            model.getRowCount() + 1,
            studentGrade.getStudentID(),
            personDAL.getPersonByID(studentGrade.getStudentID()).getFullName(),
            studentGrade.getGrade()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }

    public boolean updateGrade(int studentID, int courseID, String grade) {
        return studentgradeDAL.updateGrade(studentID, courseID, grade);
    }
}
