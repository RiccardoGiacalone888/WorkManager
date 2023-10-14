import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TaskDAO {
    public void addTask(String description) {
        Connection connection = DataBaseConn.getConnection();
        try {
            String query = "INSERT INTO tasks (description) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, description);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
