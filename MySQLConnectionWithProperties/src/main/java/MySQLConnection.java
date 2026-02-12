import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {

    private static final String PROPERTIES_FILE = "db.properties";

    private static String url;
    private static String user;
    private static String password;

    // Statischer Initialisierungsblock
    // Wird einmal ausgeführt, wenn die Klasse geladen wird
    static {
        try (InputStream input =
                     MySQLConnection.class
                             .getClassLoader()
                             .getResourceAsStream(PROPERTIES_FILE)) {

            if (input == null) {
                throw new RuntimeException("db.properties nicht gefunden");
            }

            Properties properties = new Properties();
            properties.load(input);

            url = properties.getProperty("db.url");
            user = properties.getProperty("db.user");
            password = properties.getProperty("db.password");

        } catch (Exception e) {
            throw new RuntimeException("Fehler beim Laden der DB-Konfiguration", e);
        }
    }

    private MySQLConnection() {
        // verhindert Instanziierung
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
