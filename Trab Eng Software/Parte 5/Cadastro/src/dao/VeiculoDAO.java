/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Veiculo;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author João Paulo Radd
 */
public class VeiculoDAO {
    private Connection connection;
    int id_veiculo;
    String marca_veiculo;
    int id_usuario_veiculo;
    String ano_veiculo;
    String modelo_veiculo;
    String placa_veiculo;
    String condicao_veiculo;
    float valor_compra_veiculo;
    float valor_venda_veiculo;
    
    public VeiculoDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }
    
    public void deletaVeiculo(Veiculo veiculo){
        
        //obs a tabela é veiculos (no plural) diferentemente da classe
        String sql = "DELETE INTO veiculos(marca_veiculo,id_usuario_veiculo,ano_veiculo,modelo_veiculo,placa_veiculo,condicao_veiculo,valor_compra_veiculo,valor_venda_veiculo) VALUES(?,?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, veiculo.getMarca_veiculo());
           stmt.setInt(1, veiculo.getId_usuario_veiculo());
           stmt.setString(1, veiculo.getAno_veiculo());
           stmt.setString(1, veiculo.getModelo_veiculo());
           stmt.setString(1, veiculo.getPlaca_veiculo());
           stmt.setString(1, veiculo.getcondicao_veiculo());
           stmt.setFloat(1, veiculo.getValor_compra_veiculo());
           stmt.setFloat(1, veiculo.getValor_venda_veiculo());
           stmt.execute();
           stmt.close();
           
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
