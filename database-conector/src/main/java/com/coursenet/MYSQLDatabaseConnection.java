package com.coursenet;

public class MYSQLDatabaseConnection implements  DatabaseConnection {
    @Override
    public void  select(){
        System.out.println("MySQLDatabaseConnection.Select()");

    }
    @Override
    public void  join(){
        System.out.println("MySQLDatabaseConnection.join()");

    }
    @Override
    public void  insert(){
        System.out.println("MySQLDatabaseConnection.insert()");

    }
    @Override
    public void  update(){
        System.out.println("MySQLDatabaseConnection.update()");

    }

    @Override
    public void delete() {
        System.out.println("MySQLDatabaseConnection.delete()");

    }
}
