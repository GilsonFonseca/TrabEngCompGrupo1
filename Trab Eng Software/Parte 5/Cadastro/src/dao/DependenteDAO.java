/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Dependente;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author João Paulo Radd
 */
public class DependenteDAO {
    private Connection connection;
    int id_dependente;
    int id_titular;
    String nome_dependente;
    String dt_nascimento_dependente;
    String carteira_hab_dependente;

    public DependenteDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void deletaDependente(Dependente dependente){

        String sql = "DELETE INTO dependente(nome_dependente,dt_nascimento_dependente,carteira_hab_dependente) VALUES(?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, dependente.getNome_dependente());
           stmt.setString(2, dependente.getDt_nascimento_dependente());
           stmt.setString(3, dependente.getCarteira_hab_dependente());           
           stmt.execute();
           stmt.close();
           
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
