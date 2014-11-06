package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private Connection connection;
    int id_usuario;
    String nome_usuario;
    String cpf_usuario;
    String senha_usuario;
    String dt_nascimento_usuario;
    String carteira_hab_usuario;

    public UsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void deletaUsuario(Usuario usuario){

        String sql = "DELETE INTO usuario(nome_usuario,cpf_usuario,senha_usuario,dt_nascimento_usuario,carteira_hab_usuario) VALUES(?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, usuario.getNome_usuario());
           stmt.setString(2, usuario.getCpf_usuario());
           stmt.setString(3, usuario.getSenha_usuario());
           stmt.setString(4, usuario.getDt_nascimento_usuario());
           stmt.setString(5, usuario.getCarteira_hab_usuario());           
           stmt.execute();
           stmt.close();
           
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}