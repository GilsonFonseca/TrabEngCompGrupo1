/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

/**
 *
 * @author Paulo Henrique
 */
public class Seguro extends Gasto{
    private String empresa;
    private int tipo;
    private Dependente dependente;

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
