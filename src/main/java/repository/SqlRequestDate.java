package repository;

import repository.ConnectionDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlRequestDate {
    public SqlRequestDate() throws SQLException {
        CommonExecution.connectionDate();
    }
    ResultSet executeQuery;
    public void sqlQuerySyntax (String sql) {
        try {
            if (sql.contains("SELECT")) {
                sqlRequestSelect(sql);
            } else {
                sqlRequestChange(sql);
            }
        } catch (Exception e) {
            System.out.println("Неверный запрос " + e);
        }
    }
    public void sqlRequestSelect(String sql) throws SQLException {
        executeQuery = CommonExecution.connectionDate().executeQuery(sql+";");
        while(executeQuery.next()) {
            System.out.println(executeQuery.getString("id") + " " + executeQuery.getString("name") + " " + executeQuery.getString("AGE") + " " + executeQuery.getString("adress"));
        }
        CommonExecution.connectionExecuteQuery(executeQuery);
    }
    public void sqlRequestChange(String sql) throws SQLException {
        CommonExecution.connectionExecute(sql+";");
    }
}
