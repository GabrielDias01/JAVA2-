import java.sql.*;

public class ConnectionDAO {
    public void cleanup() {
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;
        {
            try {
                stmt.executeUpdate("drop table tbl_basica");
            } catch (Exception ex) {
                
            }
        }
    }

}
