package persistencia;

import BDInterface.Conexao;
import entidade.Veiculo;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe de persistência com o banco
 * Aqui são feitas operações com o banco de inserts, deletes, updates e selects
 * relativo a tabela usuario no banco
 */

public class PerUsuario {
    //insere novos dados no banco
    public static boolean inserir(Usuario user)
    {        
        //comando sql
        String sql="insert into usuario(nome,cpf,senha) values(?,?,?)";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1,user.getNome());
            p.setString(2,user.getCPF());
            p.setString(3,user.getSenha());
            //executa a operação
            p.executeUpdate();
            //fecha a conexão
            con.close();
            return true;
        }catch(SQLException e){
            //alerta em caso de erro de operação
            System.out.println("Erro no insert."+e);
            return false;
        }
    }
    
    //deleta dados no banco
    public static boolean excluir(int id)
    {
        //comando sql 
        String sql="delete from usuario where id_usuario =?";
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setInt(1, id);
             //executa a operação
             p.executeUpdate();
             //fecha a conexão
             con.close();
             return true;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Erro no select.");
              return false;
         }
    }
    
    //deleta dados no banco
    public static boolean alterar(Usuario user)
    {
        //comando sql 
        String sql="update usuario set nome =?, cpf =? where id_usuario =?";
         //tenta realizar a operação
         try{
             //realiza a conexaocom o banco
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setString(1,user.getNome());
             p.setString(2,user.getCPF());
             //p.setString(3,user.getSenha());
             p.setInt(3,user.getID());
             //executa a operação
             p.executeUpdate();
             //fecha a conexão
             con.close();
             return true;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Erro no select.");
              return false;
         }
    }
    
    //deleta dados no banco
    public static ArrayList <Usuario> consultar()
    {
        //comando sql 
        String sql="select id_usuario,nome,cpf from usuario";
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             //executa a query
             ResultSet resultSet=p.executeQuery();
             //com os dados vai preencher os dados da consulta num array
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
             //fecha a conexão
             con.close();
             return users;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Erro no select.");
              return null;
         }
    }
    
    //metodo para confirmar login
    public static boolean login(String usr,String senha)
    {
        //comando sql 
        String sql="select count(id_usuario)from usuario where nome=? and senha=?";
        //tenta realizar a operação
        try{
            //realiza a conexão com o banco
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             //insere os dados bara buscar existencia de senha e login correspondentes
             p.setString(1, usr);
             p.setString(2, senha);
             //executa a query/busca
             p.executeQuery();
             //armazena o resultado e trata-o, se retornar 0, login e senha batem
             ResultSet resultSet=p.executeQuery();
             resultSet.next();
             int r = resultSet.getInt(1);
             //fecha conexao
             con.close();
             //retorna resultado
             return r==1;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println(e);
              return false;
         }
    }
    
//    public static boolean addCarro(Usuario user,Carro carro)
//    {
//       
//    }
}
