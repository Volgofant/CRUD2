import java.sql.SQLException;

public class Crud {
    public static void main(String[] args) throws SQLException {
        new InsertDate().insertByDefaultId("Виктор", "Москва", 28);
        new SelectDate().selectAllDate();
    }
}
