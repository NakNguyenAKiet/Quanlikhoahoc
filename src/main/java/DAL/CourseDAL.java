package DAL;

import DTO.Course;
import Utils.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseDAL {

    private static String sql;
    private static Statement stm;
    PreparedStatement pstmt;
    private static ResultSet rs;
    private static final Connection connection = new Connection();

    public ArrayList<Course> getAllCourse() {
        ArrayList<Course> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "select * from course";
                stm = connection.con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                    Course acc = new Course();
                    acc.setCourseID(rs.getInt("CourseID"));
                    acc.setCredits(rs.getInt("Credits"));
                    acc.setTilte(rs.getNString("Title"));
                    acc.setDepartmentID(rs.getInt("DepartmentID"));
                    list.add(acc);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }

    public Course getCourseByID(int id) {
        Course course = new Course();
        if (connection.openConnection()) {
            try {
                sql = "select * from course where CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    course.setCourseID(rs.getInt("CourseID"));
                    course.setCredits(rs.getInt("Credits"));
                    course.setTilte(rs.getNString("Title"));
                    course.setDepartmentID(rs.getInt("DepartmentID"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return course;
    }
    
    public ArrayList<Course> getCoursesBySearchFunction(String keyword) {
        ArrayList<Course> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "select * from course where CourseID LIKE ? OR Title LIKE ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, "%"+keyword+"%");
                pstmt.setString(2, "%"+keyword+"%");                
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Course acc = new Course();
                    acc.setCourseID(rs.getInt("CourseID"));
                    acc.setCredits(rs.getInt("Credits"));
                    acc.setTilte(rs.getNString("Title"));
                    acc.setDepartmentID(rs.getInt("DepartmentID"));
                    list.add(acc);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }
}
