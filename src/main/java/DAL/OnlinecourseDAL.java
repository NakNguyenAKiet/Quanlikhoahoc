package DAL;

import DTO.Onlinecourse;
import Utils.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OnlinecourseDAL {

    private static String sql;
    private static Statement stm;
    private static ResultSet rs;
    PreparedStatement pstmt;
    private static final Connection connection = new Connection();

    public ArrayList<Onlinecourse> getAllOnlineCourse() {
        ArrayList<Onlinecourse> onlineCourseList = new ArrayList<>();

        if (connection.openConnection()) {
            try {
                sql = "SELECT course.CourseID, course.Title, course.Credits, course.DepartmentID, onlinecourse.url "
                        + "FROM course "
                        + "INNER JOIN onlinecourse ON course.CourseID = onlinecourse.CourseID";

                stm = connection.con.createStatement();
                rs = stm.executeQuery(sql);

                while (rs.next()) {
                    Onlinecourse onlinecourse = new Onlinecourse();
                    onlinecourse.setCourseID(rs.getInt("CourseID"));
                    onlinecourse.setTilte(rs.getNString("Title"));
                    onlinecourse.setCredits(rs.getInt("Credits"));
                    onlinecourse.setDepartmentID(rs.getInt("DepartmentID"));
                    onlinecourse.setUrl(rs.getNString("url"));

                    onlineCourseList.add(0, onlinecourse);
                }

            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }

        return onlineCourseList;
    }

    public Onlinecourse getOnlineCourseByCourseID(int courseID) {
        Onlinecourse onlineCourse = new Onlinecourse();
        if (connection.openConnection()) {
            try {
                sql = "SELECT course.CourseID, course.Title, course.Credits, course.DepartmentID, onlinecourse.url "
                        + "FROM course "
                        + "INNER JOIN onlinecourse ON course.CourseID = onlinecourse.CourseID "
                        + "WHERE course.CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, courseID);
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    onlineCourse = new Onlinecourse();
                    onlineCourse.setCourseID(rs.getInt("CourseID"));
                    onlineCourse.setTilte(rs.getNString("Title"));
                    onlineCourse.setCredits(rs.getInt("Credits"));
                    onlineCourse.setDepartmentID(rs.getInt("DepartmentID"));
                    onlineCourse.setUrl(rs.getNString("url"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return onlineCourse;
    }

    public boolean createOnlineCourse(Onlinecourse course) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "INSERT INTO Course (CourseID, Title, Credits, DepartmentID) VALUES (?, ?, ?, ?)";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, course.getCourseID());
                pstmt.setString(2, course.getTilte());
                pstmt.setInt(3, course.getCredits());
                pstmt.setInt(4, course.getDepartmentID());
                int affectedRows = pstmt.executeUpdate();
                pstmt.close();

                if (affectedRows > 0) {
                    sql = "INSERT INTO OnlineCourse (CourseID, url) VALUES (?, ?)";
                    pstmt = connection.con.prepareStatement(sql);
                    pstmt.setInt(1, course.getCourseID());
                    pstmt.setString(2, course.getUrl());
                    affectedRows = pstmt.executeUpdate();
                    pstmt.close();
                    if (affectedRows > 0) {
                        result = true;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return result;
    }

    public boolean deleteOnlineCourse(int courseID) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "DELETE FROM onlinecourse WHERE CourseID = ?";
                PreparedStatement pstmtDeleteOnlineCourse = connection.con.prepareStatement(sql);
                pstmtDeleteOnlineCourse.setInt(1, courseID);
                pstmtDeleteOnlineCourse.executeUpdate();

                sql = "DELETE FROM course WHERE CourseID = ?";
                PreparedStatement pstmtDeleteCourse = connection.con.prepareStatement(sql);
                pstmtDeleteCourse.setInt(1, courseID);
                int rowsAffected = pstmtDeleteCourse.executeUpdate();
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

    public boolean updateOnlineCourse(Onlinecourse course) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "UPDATE course SET Title = ?, Credits = ?, DepartmentID = ? WHERE CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, course.getTilte());
                pstmt.setInt(2, course.getCredits());
                pstmt.setInt(3, course.getDepartmentID());
                pstmt.setInt(4, course.getCourseID());
                @SuppressWarnings("UnusedAssignment")
                int rowsAffected = pstmt.executeUpdate();
                pstmt.close();

                sql = "UPDATE onlinecourse SET url = ? WHERE CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, course.getUrl());
                pstmt.setInt(2, course.getCourseID());
                rowsAffected = pstmt.executeUpdate();
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

    public ArrayList<Onlinecourse> searchOnlineCourses(String keyword) {
        ArrayList<Onlinecourse> onlineCourseList = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT course.CourseID, course.Title, course.Credits, course.DepartmentID, onlinecourse.url "
                        + "FROM course "
                        + "INNER JOIN onlinecourse ON course.CourseID = onlinecourse.CourseID "
                        + "WHERE course.CourseID LIKE ? OR course.Title LIKE ? OR course.DepartmentID LIKE ? OR onlinecourse.url LIKE ?";

                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, "%" + keyword + "%");
                pstmt.setString(2, "%" + keyword + "%");
                pstmt.setString(3, "%" + keyword + "%");
                pstmt.setString(4, "%" + keyword + "%");
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Onlinecourse onlinecourse = new Onlinecourse();
                    onlinecourse.setCourseID(rs.getInt("CourseID"));
                    onlinecourse.setTilte(rs.getNString("Title"));
                    onlinecourse.setCredits(rs.getInt("Credits"));
                    onlinecourse.setDepartmentID(rs.getInt("DepartmentID"));
                    onlinecourse.setUrl(rs.getNString("url"));
                    onlineCourseList.add(0, onlinecourse);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return onlineCourseList;
    }
}
