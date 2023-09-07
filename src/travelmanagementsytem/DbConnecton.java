package travelmanagementsytem;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnecton {

    Connection con;
    Statement s;
   DbConnecton() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql:///travelsystem","root","root");
            s= con.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}