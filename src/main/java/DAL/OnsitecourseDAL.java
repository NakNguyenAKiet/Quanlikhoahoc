package DAL;

import DTO.Onsitecourse;
import Utils.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OnsitecourseDAL {

    private static String sql;
    private static Statement stm;
    private static ResultSet rs;
    PreparedStatement pstmt;
    private static final Connection connection = new Connection();

    public ArrayList<Onsitecourse> getAllOnsiteCourse() {
        ArrayList<Onsitecourse> onsiteCourseList = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT course.CourseID, course.Title, course.Credits, course.DepartmentID, "
                        + "onsitecourse.Location, onsitecourse.Days, onsitecourse.Time "
                        + "FROM course "
                        + "INNER JOIN onsitecourse ON course.CourseID = onsitecourse.CourseID";

                pstmt = connection.con.prepareStatement(sql);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Onsitecourse onsiteCourse = new Onsitecourse();
                    onsiteCourse.setCourseID(rs.getInt("CourseID"));
                    onsiteCourse.setTilte(rs.getString("Title"));
                    onsiteCourse.setCredits(rs.getInt("Credits"));
                    onsiteCourse.setDepartmentID(rs.getInt("DepartmentID"));
                    onsiteCourse.setLocation(rs.getString("Location"));
                    onsiteCourse.setDays(rs.getString("Days"));
                    onsiteCourse.setTime(rs.getString("Time"));

                    onsiteCourseList.add(onsiteCourse);
                }
            } catch (SQLException ex) {
                Logger.getLogger(OnsitecourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return onsiteCourseList;
    }

    public Onsitecourse getOnsiteCourseByCourseID(int courseID) {
        Onsitecourse onsiteCourse = new Onsitecourse();
        if (connection.openConnection()) {
            try {
                sql = "SELECT course.CourseID, course.Title, course.Credits, course.DepartmentID, onsitecourse.Location, onsitecourse.Days, onsitecourse.Time "
                        + "FROM course "
                        + "INNER JOIN onsitecourse ON course.CourseID = onsitecourse.CourseID "
                        + "WHERE course.CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, courseID);
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    onsiteCourse = new Onsitecourse();
                    onsiteCourse.setCourseID(rs.getInt("CourseID"));
                    onsiteCourse.setTilte(rs.getNString("Title"));
                    onsiteCourse.setCredits(rs.getInt("Credits"));
                    onsiteCourse.setDepartmentID(rs.getInt("DepartmentID"));
                    onsiteCourse.setLocation(rs.getString("Location"));
                    onsiteCourse.setDays(rs.getString("Days"));
                    onsiteCourse.setTime(rs.getString("Time"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return onsiteCourse;
    }

    public boolean createOnsiteCourse(Onsitecourse course) {
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
                    sql = "INSERT INTO OnsiteCourse (CourseID, Location, Days, Time) VALUES (?, ?, ?, ?)";
                    pstmt = connection.con.prepareStatement(sql);
                    pstmt.setInt(1, course.getCourseID());
                    pstmt.setString(2, course.getLocation());
                    pstmt.setString(3, course.getDays());
                    pstmt.setString(4, course.getTime());
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

    public boolean deleteOnsiteCourse(int courseID) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "DELETE FROM onsitecourse WHERE CourseID = ?";
                PreparedStatement pstmtDeleteOnsiteCourse = connection.con.prepareStatement(sql);
                pstmtDeleteOnsiteCourse.setInt(1, courseID);
                pstmtDeleteOnsiteCourse.executeUpdate();

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

    public boolean updateOnsiteCourse(Onsitecourse course) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "UPDATE course SET Title = ?, Credits = ?, DepartmentID = ? WHERE CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, course.getTilte());
                pstmt.setInt(2, course.getCredits());
                pstmt.setInt(3, course.getDepartmentID());
                pstmt.setInt(4, course.getCourseID());
                int rowsAffected = pstmt.executeUpdate();
                pstmt.close();

                sql = "UPDATE onsitecourse SET Location = ?, Days = ?, Time = ? WHERE CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, course.getLocation());
                pstmt.setString(2, course.getDays());
                pstmt.setString(3, course.getTime());
                pstmt.setInt(4, course.getCourseID());
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

    public ArrayList<Onsitecourse> searchOnsiteCourses(String keyword) {
        ArrayList<Onsitecourse> onsiteCourseList = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT course.CourseID, course.Title, course.Credits, course.DepartmentID, onsitecourse.Location, onsitecourse.Days "
                        + "FROM course "
                        + "INNER JOIN onsitecourse ON course.CourseID = onsitecourse.CourseID "
                        + "WHERE course.CourseID LIKE ? OR course.Title LIKE ? OR course.DepartmentID LIKE ? OR onsitecourse.Location LIKE ? OR onsitecourse.Days LIKE ?";

                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, "%" + keyword + "%");
                pstmt.setString(2, "%" + keyword + "%");
                pstmt.setString(3, "%" + keyword + "%");
                pstmt.setString(4, "%" + keyword + "%");
                pstmt.setString(5, "%" + keyword + "%");
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Onsitecourse onsitecourse = new Onsitecourse();
                    onsitecourse.setCourseID(rs.getInt("CourseID"));
                    onsitecourse.setTilte(rs.getNString("Title"));
                    onsitecourse.setCredits(rs.getInt("Credits"));
                    onsitecourse.setDepartmentID(rs.getInt("DepartmentID"));
                    onsitecourse.setLocation(rs.getNString("Location"));
                    onsitecourse.setDays(rs.getNString("Days"));
                    onsiteCourseList.add(0, onsitecourse);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return onsiteCourseList;
    }
}
