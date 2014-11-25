/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import BDInterface.Conexao;
import entidade.Carro;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PerVeiculo {
    
          public static boolean inserir(Carro user)
        {     
        //comando sql
        String sql="insert into veiculo(marca,cor,usuario, ano, modelo, placa, condicao, valorComprado, valorVendido) values(?,?,?,?,?,?,?,?,?)";
        //tenta realizar a operação
        try{
            //realiza a conexao
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1, user.getMarca().getNome());
            p.setString(2,user.getCor());
            p.setString(3,user.getUsuario().getNome());
            p.setString(4, user.getAno());
            p.setString(5,user.getModelo());
            p.setString(6, user.getPlaca());
                    
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
}
