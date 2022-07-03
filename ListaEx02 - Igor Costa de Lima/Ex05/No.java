package Ex05;

public class No {

    private String dado;
    private No prox;

    public No(String dado, No prox) {
        this.dado = dado;
        this.prox = prox;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
