package entidade;
/*
    *subclasse de pessoa com seus GETS e SETS
*/
public class Usuario extends Pessoa{
    String senha;
    int ID;
    int i =0, j= 0;
    Dependente [] dependentes;
    Carro [] carros;

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
    
    public Dependente getDependente(int i)
    {
        return dependentes[i];
    }
    
    public void setDependente(Dependente dependente)
    {
        this.dependentes[i] = dependente;
        i++;
    }
    
    public Carro getCarro(int i)
    {
        return carros[i];
    }
    
    public void setCarro(Carro carro)
    {
        this.carros[j] = carro;
        j++;
    }
    
}
