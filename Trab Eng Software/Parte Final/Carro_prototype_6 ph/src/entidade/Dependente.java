package entidade;
public class Dependente extends Pessoa{
    int ID_responsavel;
    int ID;

    public int getResponsavel() {
        return ID_responsavel;
    }

    public void setResponsavel(int responsavel) {
        this.ID_responsavel = responsavel;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
