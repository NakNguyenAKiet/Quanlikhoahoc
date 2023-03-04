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

//    public ArrayList<Courseinstructor> getAllCourseInstructor() {
//        ArrayList<Courseinstructor> list = new ArrayList<>();
//        if (connection.openConnection()) {
//            try {
//                sql = "select * from courseinstructor";
//                stm = connection.con.createStatement();
//                rs = stm.executeQuery(sql);
//                while (rs.next()) {
//                    Courseinstructor courseIntructor = new Courseinstructor();
//                    courseIntructor.setCourseID(rs.getInt("CourseID"));
//                    courseIntructor.setPersonID(rs.getInt("PersonID"));
//                    list.add(courseIntructor);
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                connection.closeConnection();
//            }
//        }
//        return list;
//    }
    
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
//    public Courseinstructor getCourseByID(int id) {
//        Courseinstructor course = new Courseinstructor();
//        if (connection.openConnection()) {
//            try {
//                sql = "select * from course where CourseID = ?";
//                pstmt = connection.con.prepareStatement(sql);
//                pstmt.setInt(1, id);
//                rs = pstmt.executeQuery();
//                while (rs.next()) {
//                    course.setCourseID(rs.getInt("CourseID"));
//                    course.setCredits(rs.getInt("Credits"));
//                    course.setTilte(rs.getNString("Title"));
//                    course.setDepartmentID(rs.getInt("DepartmentID"));
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                connection.closeConnection();
//            }
//        }
//        return course;
//    }
//    
//    public ArrayList<Course> getCoursesBySearchFunction(String keyword) {
//        ArrayList<Course> list = new ArrayList<>();
//        if (connection.openConnection()) {
//            try {
//                sql = "select * from course where CourseID LIKE ? OR Title LIKE ?";
//                pstmt = connection.con.prepareStatement(sql);
//                pstmt.setString(1, "%"+keyword+"%");
//                pstmt.setString(2, "%"+keyword+"%");                
//                rs = pstmt.executeQuery();
//                while (rs.next()) {
//                    Course acc = new Course();
//                    acc.setCourseID(rs.getInt("CourseID"));
//                    acc.setCredits(rs.getInt("Credits"));
//                    acc.setTilte(rs.getNString("Title"));
//                    acc.setDepartmentID(rs.getInt("DepartmentID"));
//                    list.add(acc);
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                connection.closeConnection();
//            }
//        }
//        return list;
//    }

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
}
