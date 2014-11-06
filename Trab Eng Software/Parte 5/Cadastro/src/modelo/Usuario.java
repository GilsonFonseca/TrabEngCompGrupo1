/**
 * --
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(50) NOT NULL,
  `cpf_usuario` varchar(11) NOT NULL,
  `senha_usuario` varchar(15) NOT NULL,
  `dt_nascimento_usuario` varchar(10) NOT NULL,
  `carteira_hab_usuario` varchar(15) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `nome_usuario` (`nome_usuario`,`cpf_usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome_usuario`, `cpf_usuario`, `senha_usuario`, `dt_nascimento_usuario`, `carteira_hab_usuario`) VALUES
(1, 'Joao', '12345678901', '123456', '1990-10-15', '123456'),
(2, 'Zé', '12332132112', '123', '1991-11-11', '1235');
 */

package modelo;
public class Usuario {
    int id_usuario;
    String nome_usuario;
    String cpf_usuario;
    String senha_usuario;
    String dt_nascimento_usuario;
    String carteira_hab_usuario;
    
    public String getCarteira_hab_usuario() {
        return carteira_hab_usuario;
    }

    public void setCarteira_hab_usuario(String carteira_hab_usuario) {
        this.carteira_hab_usuario = carteira_hab_usuario;
    }
    
    public String getDt_nascimento_usuario() {
        return dt_nascimento_usuario;
    }

    public void setDt_nascimento_usuario(String dt_nascimento_usuario) {
        this.dt_nascimento_usuario = dt_nascimento_usuario;
    }
    
    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

}