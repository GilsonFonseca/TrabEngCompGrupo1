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
    
}
