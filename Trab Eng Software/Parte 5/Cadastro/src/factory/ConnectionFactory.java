// situa em qual package ou “pacote” está a classe
package factory;
// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

public class ConnectionFactory {
    public Connection getConnection() {
        try {//altere "seu-nome-de-usuario" e "sua-senha" para as configurações do Banco de Dados.
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","seu-nome-de-usuario","sua-senha");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}