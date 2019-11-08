package repository;

import repository.ConnectionDB;

import java.sql.SQLException;

public class DeleteDate {
    public DeleteDate() throws SQLException {
        CommonExecution.connectionDate();

    }

    public void deleteById(int id) throws SQLException {
        String sql = "DELETE FROM test WHERE id =" + id + ";";
        CommonExecution.connectionExecute(sql);
    }
}
