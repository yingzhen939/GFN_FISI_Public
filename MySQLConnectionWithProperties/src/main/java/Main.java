import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String sql = "SELECT actor_id, first_name, last_name FROM actor LIMIT 10";

        // try-with-resources
        try (
                Connection connection = MySQLConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {

            System.out.println("Verbindung erfolgreich!");

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("actor_id") + " | " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}