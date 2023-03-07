/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

//import DTO.Course;
import DTO.CourseInstructorExtended;
import DTO.Courseinstructor;
import Utils.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
/**
 *
 * @author ADMIN
 */
public class CourseInstructorDAL {
    private static String sql;
    private static Statement stm;
    PreparedStatement pstmt;
    private static ResultSet rs;
    private static final Connection connection = new Connection();

    public ArrayList<Courseinstructor> getAllCourseInstructor() {
        ArrayList<Courseinstructor> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "select * from courseinstructor";
                stm = connection.con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    Courseinstructor courseIntructor = new Courseinstructor();
                    courseIntructor.setCourseID(rs.getInt("CourseID"));
                    courseIntructor.setPersonID(rs.getInt("PersonID"));
                    list.add(courseIntructor);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }
    
    public ArrayList<CourseInstructorExtended> getDetailsCourseInstructor() {
        ArrayList<CourseInstructorExtended> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT courseinstructor.CourseID, course.Title, courseinstructor.PersonID, person.Lastname, person.Firstname "
                        + "FROM courseinstructor "
                        + "INNER JOIN course ON courseinstructor.CourseID = course.CourseID INNER JOIN person ON courseinstructor.PersonID = person.PersonID";
                stm = connection.con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    CourseInstructorExtended CourseInstructorExtended = new CourseInstructorExtended();
                    CourseInstructorExtended.setCourseID(rs.getInt("CourseID"));
                    CourseInstructorExtended.setTitleCourse(rs.getString("Title"));                   
                    CourseInstructorExtended.setPersonID(rs.getInt("PersonID"));                   
                    CourseInstructorExtended.setLastName(rs.getString("Lastname"));
                    CourseInstructorExtended.setFirstName(rs.getString("Firstname"));
                    list.add(CourseInstructorExtended);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }
    public ArrayList<CourseInstructorExtended> getDetailsCourseInstructorBySearch(String keyWord) {
        ArrayList<CourseInstructorExtended> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT courseinstructor.CourseID, course.Title, courseinstructor.PersonID, person.Lastname, person.Firstname "
                        + "FROM courseinstructor "
                        + "INNER JOIN course ON courseinstructor.CourseID = course.CourseID INNER JOIN person ON courseinstructor.PersonID = person.PersonID "
                        + "WHERE courseinstructor.CourseID LIKE ? OR course.Title LIKE ? OR courseinstructor.PersonID LIKE ? OR person.Lastname LIKE ? OR person.Firstname LIKE ?";
                pstmt = connection.con.prepareStatement(sql);              
                pstmt.setString(1, "%"+keyWord+"%");
                pstmt.setString(2, "%"+keyWord+"%");
                pstmt.setString(3, "%"+keyWord+"%");
                pstmt.setString(4, "%"+keyWord+"%");
                pstmt.setString(5, "%"+keyWord+"%");
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    CourseInstructorExtended CourseInstructorExtended = new CourseInstructorExtended();
                    CourseInstructorExtended.setCourseID(rs.getInt("CourseID"));
                    CourseInstructorExtended.setTitleCourse(rs.getString("Title"));                   
                    CourseInstructorExtended.setPersonID(rs.getInt("PersonID"));                   
                    CourseInstructorExtended.setLastName(rs.getString("Lastname"));
                    CourseInstructorExtended.setFirstName(rs.getString("Firstname"));
                    list.add(CourseInstructorExtended);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }

    public boolean deleteCourseInstructor(int courseID, int personID) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "DELETE FROM courseinstructor WHERE CourseID = ? AND PersonID = ?";
                PreparedStatement pstmtDeleteCourseInstructor = connection.con.prepareStatement(sql);
                pstmtDeleteCourseInstructor.setInt(1, courseID);
                pstmtDeleteCourseInstructor.setInt(2, personID);
                int rowsAffected = pstmtDeleteCourseInstructor.executeUpdate();
                if (rowsAffected > 0) {
                    result = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return result;
    }

    public boolean updateCourseInstructor(int courseIDOld, int personIDOld, int CourseIDNew, int PersonIDNew) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "UPDATE courseinstructor SET CourseID = ?, PersonID = ? WHERE CourseID = ? AND PersonID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, CourseIDNew);//NEW VALUE
                pstmt.setInt(2, PersonIDNew);//NEW VALUE
                pstmt.setInt(3, courseIDOld);//OLD
                pstmt.setInt(4, personIDOld);//OLD
                int rowsAffected = pstmt.executeUpdate();
                pstmt.close();
                if (rowsAffected > 0) {
                    result = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return result;
    }

    public boolean createCourseIntructor(Courseinstructor Courseinstructor) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "INSERT INTO courseinstructor (CourseID, PersonID) VALUES (?, ?)";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, Courseinstructor.getCourseID());
                pstmt.setInt(2, Courseinstructor.getPersonID());
                int rowsAffected = pstmt.executeUpdate();
                pstmt.close();
                if (rowsAffected > 0) {
                    result = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return result;
    }
}
