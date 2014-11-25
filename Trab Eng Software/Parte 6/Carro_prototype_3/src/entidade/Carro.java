/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Gilson
 */
public class Carro {
    Marca marca;
    String chassi;
    String cor;
    Usuario usuario;
    String ano;
    String modelo;
    String placa;
    int condicao;
    float valorComprado;
    float valorVendido;
    
    public Marca getMarca()
    {
        return marca;
    }
    
    public void setMarca(Marca marca)
    {
        this.marca = marca;
    }
    
    public String getChassi()
    {
        return chassi;
    }
    
    public void setChassi(String chassi)
    {
        this.chassi = chassi;
    }
    
    public String getCor()
    {
        return cor;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
    public String getAno()
    {
        return ano;
    }
    
    public void setAno(String ano)
    {
        this.ano = ano;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getPlaca()
    {
        return placa;
    }
    
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public float getValorVendido()
    {
        return valorVendido;
    }
    
    public void setValorVendido(float valorVendido)
    {
        this.valorVendido = valorVendido;
    }
    
    public float getValorComprado()
    {
        return valorVendido;
    }
    
    public void setValorComprado(float valorComprado)
    {
        this.valorComprado = valorComprado;
    }
    
    public int getCondicao()
    {
        return condicao;
    }
    
    public void setCondicao(int condicao)
    {
        this.condicao = condicao;
    }
    
        public Usuario getUsuario()
    {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }
}
