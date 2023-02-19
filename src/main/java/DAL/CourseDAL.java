/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Course;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nakng
 */
public class CourseDAL {
    private Connection con;
    private static String sql;
    private static Statement stm;
    private static ResultSet rs;
    public boolean openConnection(){
        try {
            String dbPath = "jdbc:mysql://localhost: 3306/school?useUnicode=yes&characterEncoding=UTF-8";
            con = DriverManager.getConnection(dbPath, "root", "");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void closeConnection(){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    public ArrayList<Course> getAllCourse(){
        ArrayList<Course> list = new ArrayList<Course>();
        if(openConnection()){
            try {
                sql = "select * from course";
                stm = con.createStatement();
                rs = stm.executeQuery(sql);
                while(rs.next()){
                    Course acc = new Course();
                    acc.setCourseID(rs.getInt("CourseID"));
                    acc.setCredits(rs.getInt("Credits"));
                    acc.setTilte(rs.getNString("Title"));
                    acc.setDepartmentID(rs.getInt("DepartmentID"));
                    list.add(acc);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                closeConnection();
            }
        }   
        return list;
    }  
}
