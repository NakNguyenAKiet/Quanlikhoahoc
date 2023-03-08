package BLL;

import DAL.OnlinecourseDAL;
import DTO.Onlinecourse;
import Utils.Validate;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class OnlinecourseBLL {

    private static final OnlinecourseDAL onlineCourseDAL = new OnlinecourseDAL();
    private static final Validate validate = new Validate();

    public Onlinecourse getOnlineCourseByCourseID(int courseID) {
        return onlineCourseDAL.getOnlineCourseByCourseID(courseID);
    }

    public void displayOnlineCoursesInTable(JTable table) {
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        onlineCourseDAL.getAllOnlineCourse().stream().map(onlinecourse -> new Object[]{
            onlinecourse.getCourseID(),
            onlinecourse.getTilte(),
            onlinecourse.getCredits(),
            onlinecourse.getDepartmentID(),
            onlinecourse.getUrl()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }

    public String validateOnlineCourseInput(String id, String title, String credits, String departmentID, String url) {
        String error = null;

        if(id != null) {
            if (!validate.isValidID(id)) {
            error = "Invalid Course ID (A non-negative integer)";
            return error;
            } else if (validate.checkIdExists(Integer.parseInt(id), "course", "CourseID")) {
                error = "Course ID already exists";
                return error;
            }
        }
        
        if (!validate.validateTitle(title)) {
            error = "Invalid Title (Minimum length is 4)";
            return error;
        }

        if (!validate.validateCredits(credits)) {
            error = "Invalid Credits (A non-negative integer)";
            return error;
        }

        if (!validate.isValidID(departmentID)) {
            error = "Invalid Department ID (A non-negative integer)";
            return error;
        } else if (!validate.checkIdExists(Integer.parseInt(departmentID), "course", "DepartmentID")) {
            error = "Department ID doesn't exist";
            return error;
        }

        if (!validate.validateURL(url)) {
            error = "Invalid URL";
            return error;
        }
        return error;
    }

    public void handleResetOnlineCourse(JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField urlField) {
        idField.setEditable(true);
        idField.setText("");
        titleField.setText("");
        creditsField.setText("");
        departmentIDField.setText("");
        urlField.setText("");
    }
    
    public String handleCreateOnlineCourse(JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField urlField) {
        String id = idField.getText();
        String title = titleField.getText();
        String credits = creditsField.getText();
        String departmentID = departmentIDField.getText();
        String url = urlField.getText();

        String error = validateOnlineCourseInput(id, title, credits, departmentID, url);

        if (error == null) {
            Onlinecourse course = new Onlinecourse();
            course.setCourseID(Integer.parseInt(id));
            course.setTilte(title);
            course.setCredits(Integer.parseInt(credits));
            course.setDepartmentID(Integer.parseInt(departmentID));
            course.setUrl(url);

            if (!onlineCourseDAL.createOnlineCourse(course)) {
                error = "There was an error while creating the course, please try again later";
            } else {
                handleResetOnlineCourse(idField, titleField, creditsField, departmentIDField, urlField);
            }
        }
        return error;
    }

    public String handleSelectedOnlineCourse(int courseID, JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField urlField) {
        String error = null;
        Onlinecourse course = getOnlineCourseByCourseID(courseID);
        if (course != null) {
            idField.setText(Integer.toString(course.getCourseID()));
            titleField.setText(course.getTilte());
            creditsField.setText(Integer.toString(course.getCredits()));
            departmentIDField.setText(Integer.toString(course.getDepartmentID()));
            urlField.setText(course.getUrl());
        } else {
            error = "An error occurred while retrieving course data, please try again later";
        }
        return error;
    }

    public String handleDeleteOnlineCourse(int courseID, JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField urlField) {
        String error = null;
        boolean result = onlineCourseDAL.deleteOnlineCourse(courseID);

        if (result) {
            handleResetOnlineCourse(idField, titleField, creditsField, departmentIDField, urlField);
        } else {
            error = "An error occurred while deleting the course, please try again later";
        }
        return error;
    }

    public String handleUpdateOnlineCourse(int courseID, JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField urlField) {
        String id = null;
        String title = titleField.getText();
        String credits = creditsField.getText();
        String departmentID = departmentIDField.getText();
        String url = urlField.getText();
        
        String error = validateOnlineCourseInput(id, title, credits, departmentID, url);

        if (error == null) {
            Onlinecourse course = new Onlinecourse();
            course.setCourseID(courseID);
            course.setTilte(title);
            course.setCredits(Integer.parseInt(credits));
            course.setDepartmentID(Integer.parseInt(departmentID));
            course.setUrl(url);

            if (!onlineCourseDAL.updateOnlineCourse(course)) {
                error = "There was an error while updating the course, please try again later";
            } else {
                handleResetOnlineCourse(idField, titleField, creditsField, departmentIDField, urlField);
            }
        }
        return error;
    }
    
    public String handleSearchOnlineCourses(String keyword, JTable table) {
        String error = null;
        ArrayList<Onlinecourse> onlineCourses = onlineCourseDAL.searchOnlineCourses(keyword);
        if (onlineCourses.isEmpty()) {
            error = "No matching courses found.";
            return error;
        } else {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            for (Onlinecourse course : onlineCourses) {
                Object[] row = {course.getCourseID(), course.getTilte(), course.getCredits(), course.getDepartmentID(), course.getUrl()};
                model.addRow(row);
            }
            
            return error;
        }
    }
}
