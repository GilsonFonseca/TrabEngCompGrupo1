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
    
    //metodo responsavel por criar a conexão com o banco
    public static Connection getConexao(){
        try{
            //gera as configurações relativas ao banco
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "";             
            String url = "jdbc:mysql://127.0.0.1/carbills";
            //tenta conectar ao banco e retorna o resultado
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
           }catch(ClassNotFoundException | SQLException e){
               //em caso de erro, informa o mesmo
            System.out.println(e);
           //e retorna null
            return null;
        }
    }

}
