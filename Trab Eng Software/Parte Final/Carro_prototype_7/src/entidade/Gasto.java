/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import java.util.Date;

/**
 *
 * @author João Paulo Radd
 */
public class Gasto {
    //- custo : float
    //- dt_pagamento : Date
    private float custo;
    private String dt_pagamento;
    private int id;
    private int id_usuario;
    private int id_veiculo;
    private String descricao;
    private String tipo;
    private int parcelas;
    private String intervalo_parcela;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getIntervalo_parcela() {
        return intervalo_parcela;
    }

    public void setIntervalo_parcela(String intervalo_parcela) {
        this.intervalo_parcela = intervalo_parcela;
    }
    public Gasto(){
        
    }
    
    public Gasto(float custo, String dt_pagamento){
        this.custo = custo;
        this.dt_pagamento = dt_pagamento;
    }
    
    public float getCusto(){
        return this.custo;
    }
    
    public void setCusto(float custo)
    {
        this.custo = custo;
    }
    
    public String getDt_pagamento(){
        return this.dt_pagamento;
    }
    
    public void setDt_pagamento(String dt_pagamento)
    {
        this.dt_pagamento = dt_pagamento;
    }

    public void setUsuario(Usuario b) {
        this.id = b.getID(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getUsuarioId() {
        return id;
    }
}
