package persistencia;

import BDInterface.Conexao;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PerUsuario {
    public static boolean inserir(Usuario user)
    {        
        String sql="insert into usuario(nome,cpf,senha) values(?,?,?)";
        try{
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1,user.getNome());
            p.setString(2,user.getCPF());
            p.setString(3,user.getSenha());
            p.executeUpdate();
            con.close();
            return true;
        }catch(SQLException e){
            System.out.println("Erro no insert."+e);
            return false;
        }
    }
    public static boolean excluir(int id)
    {
         String sql="delete from usuario where id_usuario =?";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setInt(1, id);
             p.executeUpdate();
             con.close();
             return true;
         } catch(SQLException e){
              System.out.println("Erro no select.");
              return false;
         }
    }
    public static boolean alterar(Usuario user)
    {
         String sql="update usuario set nome =?, cpf =? where id_usuario =?";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setString(1,user.getNome());
             p.setString(2,user.getCPF());
             //p.setString(3,user.getSenha());
             p.setInt(3,user.getID());
             p.executeUpdate();
             con.close();
             return true;
         } catch(SQLException e){
              System.out.println("Erro no select.");
              return false;
         }
    }
    public static ArrayList <Usuario> consultar()
    {
         String sql="select id_usuario,nome,cpf from usuario";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             ResultSet resultSet=p.executeQuery();
             ArrayList <Usuario> users=new ArrayList<>();
             Usuario usr;
             while(resultSet.next())
             {
                usr=new Usuario();
                usr.setID(resultSet.getInt(1));
                usr.setNome(resultSet.getString(2));
                usr.setCPF(resultSet.getString(3));
                users.add(usr);
             }
             con.close();
             return users;
         } catch(SQLException e){
              System.out.println("Erro no select.");
              return null;
         }
    }
    public static boolean login(String usr,String senha)
    {
         String sql="select count(id_usuario)from usuario where nome=? and senha=?";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setString(1, usr);
             p.setString(2, senha);
             p.executeQuery();
             ResultSet resultSet=p.executeQuery();
             resultSet.next();
             int r = resultSet.getInt(1);
             con.close();
             return r==1;
         } catch(SQLException e){
              System.out.println(e);
              return false;
         }
    }
}
