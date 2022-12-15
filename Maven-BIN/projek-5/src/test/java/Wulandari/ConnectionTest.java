package Wulandari;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest{
    @BeforeAll
    static void beforeall() {
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    @Test
    void testConnection(){
        String jdbcurl = "jdbc:mysql://localhost:3306/belajar_java";
        String username = "root";
        String password="";

        try {
            Connection connection =  DriverManager.getConnection(jdbcurl, username,password);

            System.out.println("sukses konekk ke database");
            connection.close();
        }catch  (SQLException exception){
            Assertions.fail(exception);
        }


    }
}


