package persistencia;

import BDInterface.Conexao;
import entidade.Dependente;
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

public class PerDependente {
    //insere novos dados no banco

    //insere novos dados no banco
    public static boolean inserir(Dependente user)
    {        
        //comando sql
        String sql="insert into dependente(nome,cpf,id_usuario) values(?,?,?)";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1,user.getNome());
            p.setString(2,user.getCPF());
            p.setInt(3,user.getResponsavel());
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
        String sql="delete from dependente where id=?";
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
    public static boolean alterar(Dependente user)
    {
        //comando sql 
        String sql="update dependente set nome =?, cpf =? where id=?";
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
    public static ArrayList <Dependente> consultar()
    {
        //comando sql 
        String sql="select id,nome,cpf,id_usuario from dependente";
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             //executa a query
             ResultSet resultSet=p.executeQuery();
             //com os dados vai preencher os dados da consulta num array
             ArrayList <Dependente> users=new ArrayList<>();
             Dependente usr;
             while(resultSet.next())
             {
                usr=new Dependente();
                usr.setID(resultSet.getInt(1));
                usr.setNome(resultSet.getString(2));
                usr.setCPF(resultSet.getString(3));
                usr.setResponsavel(resultSet.getInt(4));
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
       
}
