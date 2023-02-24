/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Person;
import Utils.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGOC BAU
 */
public class PersonDAL {

    private static String sql;
    private static Statement stm;
    PreparedStatement pstmt;
    private static ResultSet rs;
    private static final Connection connection = new Connection();

    public ArrayList<Person> getAllPersons() {
        ArrayList<Person> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "select * from person";
                stm = connection.con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    Person person = new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setLastname(rs.getString("Lastname"));
                    person.setFirstname(rs.getString("Firstname"));
                    person.setHireDay(rs.getString("HireDate"));
                    person.setEnrollmentDate(rs.getString("EnrollmentDate"));
                    list.add(person);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }
    
public ArrayList<Person> getAllStudents() {
        ArrayList<Person> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "select * from person WHERE HireDate IS NULL";
                stm = connection.con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    Person person = new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setLastname(rs.getString("Lastname"));
                    person.setFirstname(rs.getString("Firstname"));
                    person.setHireDay(rs.getString("HireDate"));
                    person.setEnrollmentDate(rs.getString("EnrollmentDate"));
                    list.add(person);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }

    public Person getPersonByID(int id) {
        Person person = new Person();
        if (connection.openConnection()) {
            try {
                sql = "select * from person where PersonID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setLastname(rs.getString("Lastname"));
                    person.setFirstname(rs.getString("Firstname"));
                    person.setHireDay(rs.getString("HireDate"));
                    person.setEnrollmentDate(rs.getString("EnrollmentDate"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }

        return person;
    }
    
    public ArrayList<Person> getPersonsBySearchFunction(String keyword) {
        ArrayList<Person> list = new ArrayList<>();        
        if (connection.openConnection()) {
            try {
                sql = "select * from person where PersonID LIKE ? OR Firstname LIKE ? OR Lastname LIKE ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, "%"+keyword+"%");
                pstmt.setString(2, "%"+keyword+"%");
                pstmt.setString(3, "%"+keyword+"%");
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Person person = new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setLastname(rs.getString("Lastname"));
                    person.setFirstname(rs.getString("Firstname"));
                    person.setHireDay(rs.getString("HireDate"));
                    person.setEnrollmentDate(rs.getString("EnrollmentDate"));
                    list.add(person);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }

        return list;
    }
    
    public ArrayList<Person> getStudentsBySearchFunction(String keyword) {
        ArrayList<Person> list = new ArrayList<>();        
        if (connection.openConnection()) {
            try {
                sql = "select * from person where HireDate IS NULL AND (PersonID LIKE ? OR Firstname LIKE ? OR Lastname LIKE ?)";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, "%"+keyword+"%");
                pstmt.setString(2, "%"+keyword+"%");
                pstmt.setString(3, "%"+keyword+"%");
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Person person = new Person();
                    person.setPersonID(rs.getInt("PersonID"));
                    person.setLastname(rs.getString("Lastname"));
                    person.setFirstname(rs.getString("Firstname"));
                    person.setHireDay(rs.getString("HireDate"));
                    person.setEnrollmentDate(rs.getString("EnrollmentDate"));
                    list.add(person);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }

        return list;
    }        

    public static void main(String[] args) {
        PersonDAL test = new PersonDAL();
        System.out.println(test.getStudentsBySearchFunction("a").get(0).toString());
    }
}
