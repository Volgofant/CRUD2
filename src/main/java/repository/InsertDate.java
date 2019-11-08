package repository;

import repository.ConnectionDB;

import java.sql.SQLException;

public class InsertDate {
    public InsertDate() {
        CommonExecution.connectionDate();
    }
    public void insertByDefaultId (String name, String address, int age) {
        String sql = "INSERT INTO test(name, adress, AGE) VALUES ('" + name + "', '" + address + "', "+ age +");";
        CommonExecution.connectionExecute(sql);
    }
    public void insertByHardId (int id, String name, String address, int age) {
        String sql = "INSERT INTO test(id, name, adress, AGE) VALUES ('" + id + "','" + name + "', '" + address + "', "+ age +");";
        CommonExecution.connectionExecute(sql);
    }
}
