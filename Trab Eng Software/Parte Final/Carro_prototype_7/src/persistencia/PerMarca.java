/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia; 
import BDInterface.Conexao;
import entidade.Marca;
import entidade.Usuario;
import entidade.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Gilson
 */
public class PerMarca {
     public static boolean inserir(Marca user)
        {     
        //comando sql
        String sql="INSERT INTO `marca`(`marcaNome`) VALUES (?)";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, user.getNome());                    
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
    
    
    public static ArrayList <Marca> consultar(String nome_marca)
    {
        //comando sql 
        String sql="select marcaNome from marca where marca.marcaNome = "+nome_marca;
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             //executa a query
             ResultSet resultSet=p.executeQuery();
             //com os dados vai preencher os dados da consulta num array
             ArrayList <Marca> marcas=new ArrayList<>();
             Marca marca;
             while(resultSet.next())
             {
                marca=new Marca();
                marca.setNome(nome_marca);
                marcas.add(marca);
             }
             //fecha a conexão
             con.close();
             return marcas;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Busca sem resultado.");
              return null;
         }
    }
    
    public static boolean alterar(Marca marca)
        {     
        //comando sql
        String sql="update marca set marcaNome = ? ";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, marca.getNome());                    
            //executa a operação
            p.executeUpdate();
            //fecha a conexão   
            con.close();
            return true;
        }catch(SQLException e){
            //alerta em caso de erro de operação
            System.out.println("Erro ao alterar."+e);
            return false;
        }
    }
     public static boolean excluir(String marca)
    {
        //comando sql 
        String sql="delete from marca where marcaNome =?";
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setString(1, marca);
             //executa a operação
             p.executeUpdate();
             //fecha a conexão
             con.close();
             return true;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Erro no delete");
              return false;
         }
    }
    
}
