/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import BDInterface.Conexao;
import entidade.Gasto;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gilson
 */
public class PerGastos {
     public static boolean inserir(Gasto gastos)
        {     
        //comando sql
        String sql="insert into Gasto(custo,dt_pagamento,id_usuario,id_veiculo,descricao,tipo,parcelas,intervalo_parcela) values(?,?,?,?,?,?,?,?)";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setFloat(1,gastos.getCusto());
            p.setString(2,  gastos.getDt_pagamento());                    
            p.setInt(3, gastos.getId_usuario());
            p.setInt(4, gastos.getId_veiculo());
            p.setString(5, gastos.getDescricao());
            p.setString(6, gastos.getTipo());
            p.setInt(7,gastos.getParcelas());
            p.setString(8, gastos.getIntervalo_parcela());
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
    
    
    public static ArrayList <Gasto> consultar(Gasto gasto, int usuario_id)
    {
        //comando sql 
        String sql="select gasto,dt_pagamento from Gasto where Gasto.dt_pagamento = "+gasto.getDt_pagamento();
        //tenta realizar a operação
        try{
            //realiza a conexaocom o banco 
            Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             //executa a query
             ResultSet resultSet=p.executeQuery();
             //com os dados vai preencher os dados da consulta num array
             ArrayList <Gasto> gastos=new ArrayList<>();
             Gasto gast;
             while(resultSet.next())
             {
                gast=new Gasto();
                gast.setCusto(resultSet.getFloat(1));
                gast.setDt_pagamento(resultSet.getString(2));
                Usuario b = new Usuario();
                b.setID(usuario_id);
                gast.setUsuario(b);
                gastos.add(gast);
             }
             //fecha a conexão
             con.close();
             return gastos;
         } catch(SQLException e){
             //alerta em caso de erro de operação
              System.out.println("Busca sem resultado.");
              return null;
         }
    }
    
    public static boolean alterar(Gasto user)
        {     
        //comando sql
        String sql="update conta set gasto = ?,dt_pagamento = ?where id_usuario="+user.getUsuarioId();
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setFloat(1, user.getCusto());
            p.setString(2, user.getDt_pagamento());                    
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
