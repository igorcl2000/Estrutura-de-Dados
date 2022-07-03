package Ex07;

public class No {

    private String dado;
    private No ant;
    private No prox;

    public No(String dado) {
        this.dado = dado;
    }

    public No(String dado, No ant, No prox) {
        this.dado = dado;
        this.ant = ant;
        this.prox = prox;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
