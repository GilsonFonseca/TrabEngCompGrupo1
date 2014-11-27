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
public class Combustivel extends Gasto{
    String Tipo;
    String nomePosto;
    int qttLitros;

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public void setQttLitros(int qttLitros) {
        this.qttLitros = qttLitros;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public int getQttLitros() {
        return qttLitros;
    }

}
