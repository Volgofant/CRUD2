package repository;

import repository.ConnectionDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDate {
    public SelectDate() throws SQLException {
        CommonExecution.connectionDate();
    }
    ResultSet executeQuery;
    public void selectSingleId(int id) throws SQLException {
        executeQuery = CommonExecution.connectionDate().executeQuery("SELECT * FROM test WHERE id = "+ id +";");
        while(executeQuery.next()) {
            System.out.println(executeQuery.getString("id") + " " + executeQuery.getString("name") + " " + executeQuery.getString("AGE") + " " + executeQuery.getString("adress"));
        }
        CommonExecution.connectionExecuteQuery(executeQuery);
    }
    public void selectAllDate () throws SQLException {
        executeQuery = CommonExecution.connectionDate().executeQuery("SELECT * FROM test ORDER BY id");
        while(executeQuery.next()) {
            System.out.println(executeQuery.getString("id") + " " + executeQuery.getString("name") + " " + executeQuery.getString("AGE") + " " + executeQuery.getString("adress"));
        }
        CommonExecution.connectionExecuteQuery(executeQuery);
    }
}
