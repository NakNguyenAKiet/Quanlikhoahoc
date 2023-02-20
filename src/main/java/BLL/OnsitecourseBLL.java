package BLL;

import DAL.OnsitecourseDAL;
import DTO.Onsitecourse;
import Utils.Validate;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class OnsitecourseBLL {
    private static final OnsitecourseDAL onsiteCourseDAL = new OnsitecourseDAL();
    private static final Validate validate = new Validate();

    public ArrayList<Onsitecourse> getAllOnsiteCourse() {
        return onsiteCourseDAL.getAllOnsiteCourse();
    }

    public Onsitecourse getOnsiteCourseByCourseID(int courseID) {
        return onsiteCourseDAL.getOnsiteCourseByCourseID(courseID);
    }

    public void displayOnsiteCoursesInTable(JTable table) {
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getAllOnsiteCourse().stream().map(onsitecourse -> new Object[]{
            onsitecourse.getCourseID(),
            onsitecourse.getTilte(),
            onsitecourse.getCredits(),
            onsitecourse.getDepartmentID(),
            onsitecourse.getLocation(),
            onsitecourse.getDays(),
            onsitecourse.getTime()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }

    public String validateOnsiteCourseInput(String id, String title, String credits, String departmentID, String location, String days, String time) {
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

        if (!validate.validateLocation(location)) {
            error = "Invalid Location";
            return error;
        }
        
        if (!validate.validateDays(days)) {
            error = "Invalid Days";
            return error;
        }
        
        if (!validate.validateTime(time)) {
            error = "Invalid Time";
            return error;
        }
        
        return error;
    }

    public void handleResetOnsiteCourse(JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField locationField, JTextField daysField, JTextField timeField) {
        idField.setEditable(true);
        idField.setText("");
        titleField.setText("");
        creditsField.setText("");
        departmentIDField.setText("");
        locationField.setText("");
        daysField.setText("");
        timeField.setText("");
    }
    
    public String handleCreateOnsiteCourse(JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField locationField, JTextField daysField, JTextField timeField) {
        String id = idField.getText();
        String title = titleField.getText();
        String credits = creditsField.getText();
        String departmentID = departmentIDField.getText();
        String location = locationField.getText();
        String days = daysField.getText();
        String time = timeField.getText();

        String error = validateOnsiteCourseInput(id, title, credits, departmentID, location, days, time);

        if (error == null) {
            Onsitecourse course = new Onsitecourse();
            course.setCourseID(Integer.parseInt(id));
            course.setTilte(title);
            course.setCredits(Integer.parseInt(credits));
            course.setDepartmentID(Integer.parseInt(departmentID));
            course.setLocation(location);
            course.setDays(days);
            course.setTime(time);
            
            if (!onsiteCourseDAL.createOnsiteCourse(course)) {
                error = "There was an error while creating the course, please try again later";
            } else {
                handleResetOnsiteCourse(idField, titleField, creditsField, departmentIDField, locationField, daysField, timeField);
            }
        }
        return error;
    }

    public String handleSelectedOnsiteCourse(int courseID, JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField locationField, JTextField daysField, JTextField timeField) {
        String error = null;
        Onsitecourse course = getOnsiteCourseByCourseID(courseID);
        if (course != null) {
            idField.setText(Integer.toString(course.getCourseID()));
            titleField.setText(course.getTilte());
            creditsField.setText(Integer.toString(course.getCredits()));
            departmentIDField.setText(Integer.toString(course.getDepartmentID()));
            locationField.setText(course.getLocation());
            daysField.setText(course.getDays());
            timeField.setText(course.getTime());
        } else {
            error = "An error occurred while retrieving course data, please try again later";
        }
        return error;
    }

    public String handleDeleteOnsiteCourse(int courseID, JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField locationField, JTextField daysField, JTextField timeField) {
        String error = null;
        boolean result = onsiteCourseDAL.deleteOnsiteCourse(courseID);

        if (result) {
            handleResetOnsiteCourse(idField, titleField, creditsField, departmentIDField, locationField, daysField, timeField);
        } else {
            error = "An error occurred while deleting the course, please try again later";
        }
        return error;
    }

    public String handleUpdateOnsiteCourse(int courseID, JTextField idField, JTextField titleField, JTextField creditsField, JTextField departmentIDField, JTextField locationField, JTextField daysField, JTextField timeField) {
        String id = null;
        String title = titleField.getText();
        String credits = creditsField.getText();
        String departmentID = departmentIDField.getText();
        String location = locationField.getText();
        String days = daysField.getText();
        String time = timeField.getText();
        
        String error = validateOnsiteCourseInput(id, title, credits, departmentID, location, days, time);

        if (error == null) {
            Onsitecourse course = new Onsitecourse();
            course.setCourseID(courseID);
            course.setTilte(title);
            course.setCredits(Integer.parseInt(credits));
            course.setDepartmentID(Integer.parseInt(departmentID));
            course.setLocation(location);
            course.setDays(days);
            course.setTime(time);

            if (!onsiteCourseDAL.updateOnsiteCourse(course)) {
                error = "There was an error while updating the course, please try again later";
            } else {
                handleResetOnsiteCourse(idField, titleField, creditsField, departmentIDField, locationField, daysField, timeField);
            }
        }
        return error;
    }
    
    public String handleSearchOnsiteCourses(String keyword, JTable table) {
        String error = null;
        ArrayList<Onsitecourse> onsiteCourses = onsiteCourseDAL.searchOnsiteCourses(keyword);
        if (onsiteCourses.isEmpty()) {
            error = "No matching courses found.";
            return error;
        } else {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            for (Onsitecourse course : onsiteCourses) {
                Object[] row = {course.getCourseID(), course.getTilte(), course.getCredits(), course.getDepartmentID(), course.getLocation(), course.getDays(), course.getTime()};
                model.addRow(row);
            }
            
            return error;
        }
    }
}
