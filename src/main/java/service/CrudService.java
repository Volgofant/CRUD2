package service;

import org.h2.command.dml.Delete;
import repository.*;

import java.sql.SQLException;

public class CrudService {

    public void delete(int x)  {
        try {
            new DeleteDate().deleteById(x);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insert(String name, String address, int age) {
        new InsertDate().insertByDefaultId(name, address, age);
    }
    public void insert(int id, String name, String address, int age) {
        new InsertDate().insertByHardId(id, name, address, age);
    }
    public void update(int id, String name) {
        try {
            new UpdateDate().updateByIdName(id, name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(int id, int age)  {
        try {
            new UpdateDate().updateByIdAge(id, age);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(int id, String address, int age)  {
        try {
            new UpdateDate().updateByIdAddressAge(id, address, age);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(int id, String name, String address) {
        try {
            new UpdateDate().updateByIdNameAddress(id, name, address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(int id, String name, String address, int age) {
        try {
            new UpdateDate().updateFull(id, name, address, age);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select() {
        try {
            new SelectDate().selectAllDate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void select(int id) {
        try {
            new SelectDate().selectSingleId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sqlRequest(String sql) {
        try {
            new SqlRequestDate().sqlQuerySyntax(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
