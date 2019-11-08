package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommonExecution {

    public static Statement connectionDate() {
        Statement stmt = null;
        try {
            stmt = ConnectionDB.getInstance().getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }

    public static void connectionExecute(String sql) {
        try {
            connectionDate().executeUpdate(sql);
            connectionDate().close();
            System.out.println("Отключение от БД Успешно");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void connectionExecuteQuery(ResultSet executeQuery)  {
        try {
            executeQuery.close();
            connectionDate().close();
            System.out.println("Отключение от БД Успешно");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
