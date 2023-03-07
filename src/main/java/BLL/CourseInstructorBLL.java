/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CourseInstructorDAL;
import DTO.CourseInstructorExtended;
import DTO.Courseinstructor;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class CourseInstructorBLL {
    
    CourseInstructorDAL CourseInstructorDAL = new CourseInstructorDAL();
    
    public ArrayList<CourseInstructorExtended> getDetailsCourseInstructor() {
        return CourseInstructorDAL.getDetailsCourseInstructor();
    }
    
    public ArrayList<CourseInstructorExtended> getDetailsCourseInstructorBySearch(String keyWord) {
        return CourseInstructorDAL.getDetailsCourseInstructorBySearch(keyWord);
    }
    
    public void dipslayDetailsCourseInstructorListInTable(JTable table) {        
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getDetailsCourseInstructor().stream().map(CourseInstructorExtended -> new Object[]{
            model.getRowCount()+1,
            CourseInstructorExtended.getCourseID(),
            CourseInstructorExtended.getTitleCourse(),
            CourseInstructorExtended.getPersonID(),
            CourseInstructorExtended.getFirstName(),
            CourseInstructorExtended.getLastName()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }

    public String handleSelectedCourseInstructor(int courseID, int personID, String Title, String FirstName, String LastName, JTextField title, JTextField firstName, JTextField lastName, JTextField courseIDField, JTextField personIDField) {
        title.setText(Title);
        firstName.setText(FirstName);
        lastName.setText(LastName);
        courseIDField.setText(Integer.toString(courseID));
        personIDField.setText(Integer.toString(personID));
        return null;
    }
    
    public String handleResetCourseInstructor(JTextField title, JTextField firstName, JTextField lastName, JTextField courseIDField, JTextField personIDField) {
        title.setText("");
        firstName.setText("");
        lastName.setText("");
        courseIDField.setText("");
        personIDField.setText("");
        return null;
    }

    public void displayStudentListInTableBySearchFunction(JTable table, String keyWord) {
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getDetailsCourseInstructorBySearch(keyWord).stream().map(CourseInstructorExtended -> new Object[]{
            model.getRowCount()+1,
            CourseInstructorExtended.getCourseID(),
            CourseInstructorExtended.getTitleCourse(),
            CourseInstructorExtended.getPersonID(),
            CourseInstructorExtended.getFirstName(),
            CourseInstructorExtended.getLastName()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }

    public String handleDeleteCourseInstructor(int courseID, int personID, JTextField Title, JTextField FirstName, JTextField LastName, JTextField CourseID, JTextField PersonID) {
        String error = null;
        boolean result = CourseInstructorDAL.deleteCourseInstructor(courseID, personID);
        if (result) {
            handleResetCourseInstructor(Title, FirstName, LastName, CourseID, PersonID);
        } else {
            error = "An error occurred while deleting the course instructor, please try again later";
        }
        return error;
    }

    public String handleUpdateCourseInstructor(int courseID, int personID, JTextField Title, JTextField FirstName, JTextField LastName, JTextField CourseID, JTextField PersonID) {
        String error = null;      
        boolean result = CourseInstructorDAL.updateCourseInstructor(courseID, personID, Integer.parseInt(CourseID.getText()), Integer.parseInt(PersonID.getText()));
        if (result) {
            handleResetCourseInstructor(Title, FirstName, LastName, CourseID, PersonID);
        } else {
            error = "An error occurred while updating the course instructor, please try again later";
        }
        return error;
    }

    public String handleCreateCourseIntructor(JTextField Title, JTextField FirstName, JTextField LastName, JTextField CourseID, JTextField PersonID) {
        String error = null;
        String courseID = CourseID.getText();
        String personID = PersonID.getText();
        Courseinstructor Courseinstructor = new Courseinstructor();
        Courseinstructor.setCourseID(Integer.parseInt(courseID));
        Courseinstructor.setPersonID(Integer.parseInt(personID));

        if (!CourseInstructorDAL.createCourseIntructor(Courseinstructor)) {
            error = "There was an error while creating the course, please try again later";
        } else {
            handleResetCourseInstructor(Title, FirstName, LastName, CourseID, PersonID);
        }
        return error;
    }
}
