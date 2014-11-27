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
public class PerVeiculo {
    
    public static boolean inserir(Veiculo user)
        {     
        //comando sql
        String sql="insert into veiculo(marca,cor, ano, modelo, placa, condicao, valorComprado, valorVendido,id_usuario) values(?,?,?,?,?,?,?,?,?,?)";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, user.getMarca().getNome());
            p.setString(2,user.getCor());
            p.setString(3, user.getAno());
            p.setString(4,user.getModelo());
            p.setString(5, user.getPlaca());
            p.setInt(6, user.getCondicao());
            p.setFloat(7, user.getValorComprado());
            p.setFloat(8, user.getValorVendido());
            p.setInt(9, user.getUsuario().getID());
                    
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
    
    
    public static ArrayList <Veiculo> consultar(int usuario_id)
    {
        //comando sql 
        String sql="select marca,cor, ano, modelo, placa, condicao, valorComprado, valorVendido from veiculo where veiculo.id_usuario = "+usuario_id;
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             //executa a query
             ResultSet resultSet=p.executeQuery();
             //com os dados vai preencher os dados da consulta num array
             ArrayList <Veiculo> users=new ArrayList<>();
             Veiculo usr;
             while(resultSet.next())
             {
                usr=new Veiculo();
                usr.setMarca(new Marca(resultSet.getString(1)));
                usr.setCor(resultSet.getString(2));
                usr.setAno(resultSet.getString(3));
                usr.setModelo(resultSet.getString(4));
                usr.setPlaca(resultSet.getString(5));
                usr.setCondicao(resultSet.getInt(6));
                usr.setValorComprado(resultSet.getFloat(7));
                usr.setValorVendido(resultSet.getFloat(8));
                Usuario b = new Usuario();
                b.setID(usuario_id);
                usr.setUsuario(b);
                users.add(usr);
             }
             //fecha a conexão
             con.close();
             return users;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Busca sem resultado.");
              return null;
         }
    }
    
    public static boolean alterar(Veiculo user)
        {     
        //comando sql
        String sql="update veiculo set marca = ?,cor = ?, ano = ?, modelo = ?, placa = ?, condicao = ?, valorComprado = ?, valorVendido = ?,id_usuario = ? where id_usuario="+user.getId();
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, user.getMarca().getNome());
            p.setString(2,user.getCor());
            p.setString(3, user.getAno());
            p.setString(4,user.getModelo());
            p.setString(5, user.getPlaca());
            p.setInt(6, user.getCondicao());
            p.setFloat(7, user.getValorComprado());
            p.setFloat(8, user.getValorVendido());
            p.setInt(9, user.getUsuario().getID());
                    
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
     public static boolean excluir(int id)
    {
        //comando sql 
        String sql="delete from veiculo where id_usuario =?";
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
              System.out.println("Erro no delete");
              return false;
         }
    }
}
