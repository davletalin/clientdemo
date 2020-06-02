package kz.davletalin.fibo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args) {
        String jdbcUrl="jdbc:postgresql://localhost:5432/fibo";
        String user="postgres";
        String pass="123456";
        System.out.println("Connecting to DB "+ jdbcUrl);
        try{
            Connection connection= DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println(connection);
            System.out.println("Connection successful!!!");
            connection.close();
        }catch (SQLException e){
            System.out.println("Smth wrong");
            e.printStackTrace();

        }

    }
}
