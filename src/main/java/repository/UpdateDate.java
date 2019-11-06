package repository;

import repository.ConnectionDB;

import java.sql.SQLException;

public class UpdateDate {
    public UpdateDate() {
        try {
            ConnectionDB.connectionDate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateFull(int id, String name, String address, int age) throws SQLException {
        String sql = "UPDATE test SET name = '" + name + "', adress = '"+ address +"', AGE = '"+ age +"' WHERE id = " + id + ";";
        ConnectionDB.connectionExecute(sql);
    }
    public void updateByIdName(int id, String name) throws SQLException {
        String sql = "UPDATE test SET name = '" + name + "' WHERE id = " + id + ";";
        ConnectionDB.connectionExecute(sql);
    }
    public void updateByIdNameAddress(int id, String name, String address) throws SQLException {
        String sql = "UPDATE test SET name = '" + name + "', adress = '"+ address +"' WHERE id = " + id + ";";
        ConnectionDB.connectionExecute(sql);
    }
    public void updateByIdAddressAge (int id, String address, int age) throws SQLException {
        String sql = "UPDATE test SET adress = '"+ address +"', AGE = '"+ age +"' WHERE id = " + id + ";";
        ConnectionDB.connectionExecute(sql);
    }
    public void updateByIdAge (int id, int age) throws SQLException {
        String sql = "UPDATE test SET AGE = '"+ age +"' WHERE id = " + id + ";";
        ConnectionDB.connectionExecute(sql);
    }
}
