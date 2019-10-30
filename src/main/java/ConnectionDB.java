import java.sql.*;

public class ConnectionDB {

    public static final String DB_URL = "jdbc:h2:/C:/Users/viktor.nenashev/IdeaProjects/Crud/main/java/ConnectionDB";
    public static final String DB_Driver = "org.h2.Driver";
    private static ConnectionDB instance;
    private Connection connection;

    ConnectionDB() {
        try {
            this.connection = DriverManager.getConnection(DB_URL);
            System.out.println("Подключение к ДБ Успешно");
        } catch (SQLException e) {
            System.out.println("Database connections Failed: " + e);
        }
    }
    public Connection getConnection() {
        return connection;
    }

    public static ConnectionDB getInstance() throws SQLException {
        if(instance == null) {
            instance = new ConnectionDB();
        } else if (instance.getConnection().isClosed()) {
            instance = new ConnectionDB();
        }
        return instance;
    }
    public static Statement connectionDate() throws SQLException {
        Statement stmt = getInstance().getConnection().createStatement();
        return stmt;
    }

    public static void connectionExecute(String sql) throws SQLException {
        connectionDate().executeUpdate(sql);
        connectionDate().close();
    }

    public static void connectionExecuteQuery(ResultSet executeQuery) throws SQLException {
        executeQuery.close();
        ConnectionDB.connectionDate().close();
    }





}
