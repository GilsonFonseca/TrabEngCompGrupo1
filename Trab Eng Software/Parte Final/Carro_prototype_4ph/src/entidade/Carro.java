/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

/**
 *
 * @author Paulo Henrique
 */
public class Carro {
    private String chassi;
    private int ID;
    private String cor;
    private Usuario user;
    private String ano;
    private String modelo;
    private String placa;
    private int condicao;
    private float valorComprado;
    private float valorVendido;

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the user
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the condicao
     */
    public int getCondicao() {
        return condicao;
    }

    /**
     * @param condicao the condicao to set
     */
    public void setCondicao(int condicao) {
        this.condicao = condicao;
    }

    /**
     * @return the valorComprado
     */
    public float getValorComprado() {
        return valorComprado;
    }

    /**
     * @param valorComprado the valorComprado to set
     */
    public void setValorComprado(float valorComprado) {
        this.valorComprado = valorComprado;
    }

    /**
     * @return the valorVendido
     */
    public float getValorVendido() {
        return valorVendido;
    }

    /**
     * @param valorVendido the valorVendido to set
     */
    public void setValorVendido(float valorVendido) {
        this.valorVendido = valorVendido;
    }




}
