/*
 * 
--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE IF NOT EXISTS `veiculos` (
  `id_veiculo` int(11) NOT NULL AUTO_INCREMENT,
  `marca_veiculo` varchar(15) NOT NULL,
  `id_usuario_veiculo` int(11) NOT NULL,
  `ano_veiculo` varchar(9) NOT NULL,
  `modelo_veiculo` varchar(15) NOT NULL,
  `placa_veiculo` varchar(8) NOT NULL,
  `condicao_veiculo` varchar(25) NOT NULL,
  `valor_compra_veiculo` float NOT NULL,
  `valor_venda_veiculo` float NOT NULL,
  PRIMARY KEY (`id_veiculo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`id_veiculo`, `marca_veiculo`, `id_usuario_veiculo`, `ano_veiculo`, `modelo_veiculo`, `placa_veiculo`, `condicao_veiculo`, `valor_compra_veiculo`, `valor_venda_veiculo`) VALUES
(1, 'Fiat', 1, '1998/1999', 'Uno', 'aaa-123', 'boa', 15000, 11000),
(2, 'FORD', 1, '2000/2001', 'Focus', 'abc-3214', 'a', 13000, 12000);
 */
package modelo;

/**
 *
 * @author João Paulo Radd
 */
public class Veiculo {
    int id_veiculo;
    String marca_veiculo;
    int id_usuario_veiculo;
    String ano_veiculo;
    String modelo_veiculo;
    String placa_veiculo;
    String condicao_veiculo;
    float valor_compra_veiculo;
    float valor_venda_veiculo;
    
    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }
    
    public String getMarca_veiculo() {
        return marca_veiculo;
    }

    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }
    
    public int getId_usuario_veiculo() {
        return id_usuario_veiculo;
    }

    public void setId_usuario_veiculo(int id_usuario_veiculo) {
        this.id_usuario_veiculo = id_usuario_veiculo;
    }
    
    public String getAno_veiculo() {
        return ano_veiculo;
    }

    public void setAno_veiculo(String ano_veiculo) {
        this.ano_veiculo = ano_veiculo;
    }
    
    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }
    
    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }
    
    public String getcondicao_veiculo() {
        return condicao_veiculo;
    }

    public void setcondicao_veiculo(String condicao_veiculo) {
        this.condicao_veiculo = condicao_veiculo;
    }
    
    
    public float getValor_compra_veiculo() {
        return valor_compra_veiculo;
    }

    public void setValor_compra_veiculo(float valor_compra_veiculo) {
        this.valor_compra_veiculo = valor_compra_veiculo;
    }
    
    public float getValor_venda_veiculo() {
        return valor_venda_veiculo;
    }

    public void setValor_venda_veiculo(float valor_venda_veiculo) {
        this.valor_venda_veiculo = valor_venda_veiculo;
    }
    
}
