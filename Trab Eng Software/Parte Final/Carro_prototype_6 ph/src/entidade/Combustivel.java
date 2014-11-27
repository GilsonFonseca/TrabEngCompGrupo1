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
public class Combustivel {
    String Tipo;
    String nomePosto;
    float valor;
    int qttLitros;
    Date dataAbastecimento;

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQttLitros(int qttLitros) {
        this.qttLitros = qttLitros;
    }

    public void setDataAbastecimento(Date dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public float getValor() {
        return valor;
    }

    public int getQttLitros() {
        return qttLitros;
    }

    public Date getDataAbastecimento() {
        return dataAbastecimento;
    }


}
