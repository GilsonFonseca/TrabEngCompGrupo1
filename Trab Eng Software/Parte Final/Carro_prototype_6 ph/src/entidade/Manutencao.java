/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.util.Date;

/**
 *
 * @author Paulo Henrique
 */
public class Manutencao {
    private String tipo;
    private Date dataManut;
    private String Desc;
    private float valor;
    private String nomeOficina;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dataManut
     */
    public Date getDataManut() {
        return dataManut;
    }

    /**
     * @param dataManut the dataManut to set
     */
    public void setDataManut(Date dataManut) {
        this.dataManut = dataManut;
    }

    /**
     * @return the Desc
     */
    public String getDesc() {
        return Desc;
    }

    /**
     * @param Desc the Desc to set
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the nomeOficina
     */
    public String getNomeOficina() {
        return nomeOficina;
    }

    /**
     * @param nomeOficina the nomeOficina to set
     */
    public void setNomeOficina(String nomeOficina) {
        this.nomeOficina = nomeOficina;
    }

}
