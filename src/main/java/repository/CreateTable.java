package repository;

import java.sql.SQLException;




public class CreateTable {
    public static final String CREATE_TABLE_QUERY =
            "CREATE TABLE test "
                    + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                    + "name VARCHAR(50), "
                    + "adress CHAR(50), "
                    + "AGE INT)";

    public CreateTable() {
        try {
            CommonExecution.connectionDate();
            CommonExecution.connectionDate().executeUpdate(CREATE_TABLE_QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}