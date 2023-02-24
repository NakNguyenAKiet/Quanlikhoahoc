package Utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private static final Connection connection = new Connection();
    private static PreparedStatement pstmt;
    private static ResultSet rs;
    private static Pattern pattern;
    private static Matcher matcher;
    private static String regex;

    public boolean checkIdExists(int id, String tableName, String idColumnName) {
        boolean result = false;
        if (connection.openConnection()) {
            try {
                String sql = "SELECT COUNT(*) FROM " + tableName + " WHERE " + idColumnName +" = ?";
                pstmt = connection.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                rs = pstmt.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    result = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Validate.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                connection.closeConnection();
            }
        }
        return result;
    }

    public boolean isValidID(String id) {
        if (id == null || id.trim().isEmpty()) {
            return false;
        }
        try {
            int idValue = Integer.parseInt(id);
            if (idValue <= 0) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean validateCredits(String credits) {
        if (credits == null || credits.trim().isEmpty()) {
            return false;
        }
        try {
            int creditValue = Integer.parseInt(credits);
            if (creditValue <= 0) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean validateTitle(String title) {
        return title != null && title.trim().length() >= 4;
    }

    public boolean validateLocation(String location) {
        return location != null && location.trim().length() >= 2;
    }

    public boolean validateURL(String url) {
        regex = "^(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public boolean validateDays(String days) {
        regex = "^[M|T|W|H|F]{1,5}$";
        return days.matches(regex);
    }

    public boolean validateTime(String time) {
        if (time.length() != 8) {
            return false;
        }
        String[] parts = time.split(":");
        if (parts.length != 3) {
            return false;
        }
        int hour, minute, second;
        try {
            hour = Integer.parseInt(parts[0]);
            minute = Integer.parseInt(parts[1]);
            second = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        if (hour < 0 || hour > 23) {
            return false;
        }
        if (minute < 0 || minute > 59) {
            return false;
        }
        if (second < 0 || second > 59) {
            return false;
        }
        return true;
    }
    
    public boolean isNumeric(String str){
        str = str.trim();
        return str != null && str.matches("[0-9.]+");
    }
}
