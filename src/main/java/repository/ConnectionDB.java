package repository;

import java.sql.*;

public final class ConnectionDB {

    public static final String DB_URL = "jdbc:postgresql://localhost:5444/postgres";
    String user = "volgofant";
    String pass = "1234";
    public static final String DB_Driver = "org.postgresql.Driver";
    private static ConnectionDB instance;
    private Connection connection;


    private ConnectionDB() {
        try {
            Class.forName(DB_Driver);
            this.connection = DriverManager.getConnection(DB_URL, user, pass);
            System.out.println("Подключение к ДБ Успешно");
        } catch (SQLException | ClassNotFoundException e) {
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






}
