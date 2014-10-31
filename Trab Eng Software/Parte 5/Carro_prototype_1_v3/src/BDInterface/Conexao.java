/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BDInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 209080
 */
public class Conexao {

    public static Connection getConexao(){
        try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            
            String dbName = "teste";
            String user = "sa";
            String password = "4401718";
                String SqlServerInstance = "instance=SQL2005";
            String url = "jdbc:jtds:sqlserver://HP6910P";
            url = url + "/" + dbName;
            url = url + ";" + SqlServerInstance;
            Connection con = DriverManager.getConnection(url, user, password);
            //String url="jdbc:sqlserver://HP6910P\\SQLEXPRESS;database=teste;user=sa;password=4401718";
            //Connection con=DriverManager.getConnection(url);
            return con;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            
            return null;
        }
    }

}
