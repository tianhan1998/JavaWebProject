import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.*;

public class SetUser {
    public static boolean setUser(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int succ=0;
        try {
            ComboPooledDataSource cp = new ComboPooledDataSource();
            conn = cp.getConnection();
            ps = conn.prepareStatement("insert into student values (?,?,?,?,?)");
            ps.setString(1, user.getSno());
            ps.setString(2, user.getSname());
            ps.setInt(3, user.getSage());
            ps.setString(4, user.getSsex());
            ps.setString(5, user.getSaddress());
            succ=ps.executeUpdate();
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
        if(succ>0)
            return true;
        else
            return false;
    }
}
