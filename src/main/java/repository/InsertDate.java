package repository;

import repository.ConnectionDB;

import java.sql.SQLException;

public class InsertDate {
    public InsertDate() {
        try {
            ConnectionDB.connectionDate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertByDefaultId (String name, String address, int age) {
        String sql = "INSERT INTO test(name, adress, AGE) VALUES ('" + name + "', '" + address + "', "+ age +");";
        try {
            ConnectionDB.connectionExecute(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void insertByHardId (int id, String name, String address, int age) {
        String sql = "INSERT INTO test(id, name, adress, AGE) VALUES ('" + id + "','" + name + "', '" + address + "', "+ age +");";
        try {
            ConnectionDB.connectionExecute(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
