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
public class Manutencao extends Gasto{
    private String tipo;
    private String Desc;
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
