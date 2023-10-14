import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DataBaseConn {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/work";
                String username = "root";
                String password = "Eleonora1992Riccardo1988ZeldaMalu!";
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
