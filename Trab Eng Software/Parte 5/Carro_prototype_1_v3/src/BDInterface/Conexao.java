/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BDInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 209080
 */
public class Conexao {

    public static Connection getConexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "";             
            String url = "jdbc:mysql://127.0.0.1/carbills";          
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
           }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
           
            return null;
        }
    }

}
