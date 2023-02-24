/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CourseDAL;
import DAL.PersonDAL;
import DTO.Person;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGOC BAU
 */
public class PersonBLL {
    PersonDAL personDAL = new PersonDAL();    
    
    public ArrayList<Person> getAllPersons(){
        return personDAL.getAllPersons();
    }
    
    public Person getPersonByID(int id){
        return personDAL.getPersonByID(id);
    }
    
    public ArrayList<Person> getAllStudents(){
        return personDAL.getAllStudents();
    }
    
    public ArrayList<Person> getStudentsBySearchFunction(String keyWord){
        return personDAL.getStudentsBySearchFunction(keyWord);
    }
    
    public void displayStudentListInTable(JTable table) {        
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getAllStudents().stream().map(student -> new Object[]{
            model.getRowCount()+1,
            student.getPersonID(),
            student.getFullName()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }
    
    public void displayStudentListInTableBySearchFunction(JTable table, String keyWord) {        
        table.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        getStudentsBySearchFunction(keyWord).stream().map(student -> new Object[]{
            model.getRowCount()+1,
            student.getPersonID(),
            student.getFullName()
        }).forEachOrdered(row -> {
            model.addRow(row);
        });
        table.setModel(model);
    }
}
