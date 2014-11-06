/*
 * 
--
-- Estrutura da tabela `dependente`
--

CREATE TABLE IF NOT EXISTS `dependente` (
  `id_dependente` int(11) NOT NULL AUTO_INCREMENT,
  `id_titular` int(11) NOT NULL,
  `nome_dependente` varchar(50) NOT NULL,
  `dt_nasc_dependente` varchar(15) NOT NULL,
  `carteira_hab_dependente` varchar(15) NOT NULL,
  PRIMARY KEY (`id_dependente`),
  UNIQUE KEY `nome_dependente` (`nome_dependente`),
  KEY `id_titular` (`id_titular`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `dependente`
--

INSERT INTO `dependente` (`id_dependente`, `id_titular`, `nome_dependente`, `dt_nasc_dependente`, `carteira_hab_dependente`) VALUES
(1, 1, 'Pedrinho', '12/08/1993', '1234567');
 */
package modelo;

/**
 *
 * @author João Paulo Radd
 */
public class Dependente {
    int id_dependente;
    int id_titular;
    String nome_dependente;
    String dt_nascimento_dependente;
    String carteira_hab_dependente;
    
    public String getCarteira_hab_dependente() {
        return carteira_hab_dependente;
    }

    public void setCarteira_hab_dependente(String carteira_hab_dependente) {
        this.carteira_hab_dependente = carteira_hab_dependente;
    }
    
    public String getDt_nascimento_dependente() {
        return dt_nascimento_dependente;
    }

    public void setDt_nascimento_dependente(String dt_nascimento_dependente) {
        this.dt_nascimento_dependente = dt_nascimento_dependente;
    }
    
    public int getId_dependente() {
        return id_dependente;
    }

    public void setId_dependente(int id_dependente) {
        this.id_dependente = id_dependente;
    }
    
    public int getId_titular() {
        return id_titular;
    }

    public void setId_titular(int id_titular) {
        this.id_titular = id_titular;
    }

    public String getNome_dependente() {
        return nome_dependente;
    }

    public void setNome_dependente(String nome_dependente) {
        this.nome_dependente = nome_dependente;
    }
}
