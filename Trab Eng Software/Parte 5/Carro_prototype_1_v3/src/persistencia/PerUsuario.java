package persistencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import BDInterface.Conexao;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PerUsuario {
    public static boolean inserir(Usuario user)
    {        
        String sql="insert into usuario(nome,cpf,senha) values(?,?,?)";
        try{
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1,user.getNome());
            p.setString(2,user.getCPF());
            p.setString(3,user.getSenha());
            p.executeUpdate();
            con.close();
            return true;
        }catch(SQLException e){
            System.out.println("Erro no insert."+e);
            return false;
        }
    }
    public static boolean excluir(int id)
    {
         String sql="delete from usuario where id_usuario =?";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setInt(1, id);
             p.executeUpdate();
             con.close();
             return true;
         } catch(SQLException e){
              System.out.println("Erro no select.");
              return false;
         }
    }
    public static boolean alterar(Usuario user)
    {
         String sql="update usuario set nome =?, cpf =?, senha =? where id_usuario =?";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             p.setString(1,user.getNome());
             p.setString(2,user.getCPF());
             p.setString(3,user.getSenha());
             p.setInt(4,user.getID());
             p.executeUpdate();
             con.close();
             return true;
         } catch(SQLException e){
              System.out.println("Erro no select.");
              return false;
         }
    }
    /*
    public boolean alterar(Cliente cliente)
    {
        String sql="update cliente set nomeCli=?,bairroCli=?,cepCli=?,cidadeCli=?,complementoCli=?,DataNascCli=?,numCli=?,ruaCli=?,telCli1=?,telCli2=?,EmailCli=?,status=? where codCliente=?";
        try{
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setString(1,cliente.getNome());
            p.setString(2,cliente.getBairro());
            p.setString(3,cliente.getCep());
            p.setString(4,cliente.getCidade());
            p.setString(5,cliente.getComplemento());
            p.setDate(6,cliente.getDtNascimento());
            p.setInt(7,cliente.getNumero());
            p.setString(8,cliente.getRua());
            p.setString(9,cliente.getTel1());
            p.setString(10,cliente.getTel2());
            p.setString(11,cliente.getEmail());
            p.setBoolean(12, cliente.getStatus());      
            p.setInt(13,cliente.getCodCliente());
            p.executeUpdate();
            con.close();
            return true;
        }catch(Exception e){
            System.out.println("Alterar."+e);
           
            return false;
        }
    }
     public boolean setStatus(int cod,boolean status)
    {
        String sql="update cliente set status=? where codCliente=?";
        try{
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setBoolean(1, status);
            p.setInt(2, cod);
            p.executeUpdate();
            con.close();
            return true;
        }catch(Exception e){
            System.out.println("Erro no status"+e);
            return false;
        }
    }
     public boolean setStatus(Cliente cliente)
    {
        String sql="update cliente set status=? where codCliente=?";
        try{
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setBoolean(1, cliente.getStatus());
            p.setInt(2, cliente.getCodCliente());
            p.executeUpdate();
            con.close();
            return true;
        }catch(Exception e){
            System.out.println("Erro ao setar status."+e);
            return false;
        }
    }
    
      public ArrayList <Cliente> Consulta(String nome)
    {
         String sql="select codcliente,nomeCli,Bairrocli,Cidadecli,status from cliente where nomeCli like '"+nome+"%' ";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=con.prepareStatement(sql);
             ResultSet resultSet=p.executeQuery();
             ArrayList <Cliente> clientes=new ArrayList<Cliente>();
             Cliente cliente;
             while(resultSet.next())
             {
                cliente=new Cliente();
                cliente.setCodCliente(resultSet.getInt(1));
                cliente.setNome(resultSet.getString(2));
                cliente.setBairro(resultSet.getString(3));
                cliente.setCidade(resultSet.getString(4));
                cliente.setStatus(resultSet.getBoolean(5));
                
                clientes.add(cliente);
             }
             con.close();
             return clientes;
         } catch(Exception e){
              System.out.println("Erro no select."+e);
              return null;
         }
    }
      
      public ArrayList <Cliente> Consulta(String nome,boolean habilitado)
    {
         String sql="select codcliente,nomeCli,Bairrocli,Cidadecli,status from cliente where nomeCli like '"+nome+"%' and status=?";
         
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=con.prepareStatement(sql);
             p.setBoolean(1, habilitado);
             ResultSet resultSet=p.executeQuery();
             ArrayList <Cliente> clientes=new ArrayList<Cliente>();
             Cliente cliente;
             while(resultSet.next())
             {
                cliente=new Cliente();
                cliente.setCodCliente(resultSet.getInt(1));
                cliente.setNome(resultSet.getString(2));
                cliente.setBairro(resultSet.getString(3));
                cliente.setCidade(resultSet.getString(4));
                cliente.setStatus(resultSet.getBoolean(5));
                clientes.add(cliente);
             }
             con.close();
             return clientes;
         } catch(Exception e){
              System.out.println("Erro no select."+e);
              return null;
         }
    }
    */
    public static ArrayList <Usuario> consultar()
    {
         String sql="select id_usuario,nome,cpf from usuario";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=Conexao.getConexao().prepareStatement(sql);
             ResultSet resultSet=p.executeQuery();
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
             con.close();
             return users;
         } catch(SQLException e){
              System.out.println("Erro no select.");
              return null;
         }
    }
       /*
       public ArrayList <Cliente> todosClientes(boolean habilitado)
    {
         String sql="select codcliente,nomeCli,BairroCli,CidadeCli,status from cliente where status=?";
         try{
             Connection con=Conexao.getConexao();
             PreparedStatement p=con.prepareStatement(sql);
             p.setBoolean(1, habilitado);
             ResultSet resultSet=p.executeQuery();
             
             ArrayList <Cliente> clientes=new ArrayList<Cliente>();
             
             Cliente cliente;
             while(resultSet.next())
             {
                cliente=new Cliente();
                 cliente.setCodCliente(resultSet.getInt(1));
                cliente.setNome(resultSet.getString(2));
                cliente.setBairro(resultSet.getString(3));
                cliente.setCidade(resultSet.getString(4));
                cliente.setStatus(resultSet.getBoolean(5));
                clientes.add(cliente);
             }
             con.close();
             return clientes;
         } catch(Exception e){
              System.out.println("Erro no select."+e);
              return null;
         }
    }
        public Cliente seleciona(int codcliente)
    {
         String sql="select codcliente,nomecli,bairrocli,cepcli,cidadecli,complementocli,dataNasccli,numcli,ruacli,telcli1,telcli2,Emailcli,status from cliente where codcliente=?";
         try{
            
            Connection con=Conexao.getConexao();
            PreparedStatement p=con.prepareStatement(sql);
            p.setInt(1,codcliente);
            ResultSet resultSet=p.executeQuery();
            resultSet.next();
            Cliente cliente=new Cliente();;              
            cliente.setCodCliente(resultSet.getInt(1));
            cliente.setNome(resultSet.getString(2));
            cliente.setBairro(resultSet.getString(3));
            cliente.setCep(resultSet.getString(4));
            cliente.setCidade(resultSet.getString(5));
            cliente.setComplemento(resultSet.getString(6));
            cliente.setDtNascimento(resultSet.getDate(7));
            cliente.setNumero(resultSet.getInt(8));
            cliente.setRua(resultSet.getString(9));
            cliente.setTel1(resultSet.getString(10));
            cliente.setTel2(resultSet.getString(11));
            cliente.setEmail(resultSet.getString(12));
            cliente.setStatus(resultSet.getBoolean(13));
            con.close();
            return cliente;
         } catch(Exception e){
              System.out.println("Erro no select."+e);
              return null;
         }
    }
       */
     
}
