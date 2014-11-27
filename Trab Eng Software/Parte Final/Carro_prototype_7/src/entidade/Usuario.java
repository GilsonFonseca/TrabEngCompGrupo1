package entidade;

import java.util.ArrayList;

/*
    *subclasse de pessoa com seus GETS e SETS
*/
public class Usuario extends Pessoa{
    String senha;
    int ID;
    ArrayList<Dependente> dependentes;
    ArrayList<Veiculo> veiculos;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
}
