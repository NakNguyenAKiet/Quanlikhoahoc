package Utils;

import DAL.CourseDAL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    public java.sql.Connection con;
    private final String dbPath = "jdbc:mysql://localhost:33066/school?useUnicode=yes&characterEncoding=UTF-8";

    public boolean openConnection() {
        try {
            con = DriverManager.getConnection(dbPath, "root", "");            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void closeConnection() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
