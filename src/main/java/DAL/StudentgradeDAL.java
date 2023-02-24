/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Utils.Connection;
import DTO.Studentgrade;
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
public class StudentgradeDAL {

    private static String sql;
    private static Statement stm;
    private static ResultSet rs;
    PreparedStatement pstmt;
    private static final Connection connection = new Connection();

    public ArrayList<Studentgrade> getGradeByStudentID(int id) {
        ArrayList<Studentgrade> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT * FROM studentgrade WHERE StudentID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Studentgrade studentgrade = new Studentgrade();
                    studentgrade.setEnrollmentID(rs.getInt("EnrollmentID"));
                    studentgrade.setCourseID(rs.getInt("CourseID"));
                    studentgrade.setStudentID(rs.getInt("StudentID"));
                    studentgrade.setGrade(rs.getString("Grade"));

                    list.add(studentgrade);
                }
            } catch (SQLException ex) {
                Logger.getLogger(OnsitecourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }

    public ArrayList<Studentgrade> getGradeByCourseID(int id) {
        ArrayList<Studentgrade> list = new ArrayList<>();
        if (connection.openConnection()) {
            try {
                sql = "SELECT * FROM studentgrade WHERE CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Studentgrade studentgrade = new Studentgrade();
                    studentgrade.setEnrollmentID(rs.getInt("EnrollmentID"));
                    studentgrade.setCourseID(rs.getInt("CourseID"));
                    studentgrade.setStudentID(rs.getInt("StudentID"));
                    studentgrade.setGrade(rs.getString("Grade"));

                    list.add(studentgrade);
                }
            } catch (SQLException ex) {
                Logger.getLogger(OnsitecourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return list;
    }

    public boolean updateGrade(int studentID, int courseID, String grade) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                sql = "UPDATE studentgrade "
                        + "SET Grade = ? "
                        + "WHERE StudentID = ? AND CourseID = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setString(1, grade);
                pstmt.setInt(2, studentID);
                pstmt.setInt(3, courseID);
                int rowsAffected = pstmt.executeUpdate();
                pstmt.close();

                if (rowsAffected > 0) {
                    result = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(OnsitecourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StudentgradeDAL test = new StudentgradeDAL();
        System.out.println(test.getGradeByStudentID(2).get(0).toString());
        System.out.println(test.getGradeByCourseID(2030).get(0).toString());
    }
}
