package Ex08;

public class PilhaDinamica {

    private No topo;
    private int tamanho;

    public void empilhar(No novoElemento) {
        if (topo == null) {
            topo = novoElemento;
        } else {
            novoElemento.setProx(topo);
            topo = novoElemento;
        }
        tamanho++;
    }

    public No desempilhar() {
        if (topo == null) {
            return null;
        }
        No aux = topo;
        topo = topo.getProx();
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void print() {
        No aux = this.topo;
        No fim = null;
        while (aux != null) {
            String dado = aux.getData();
            System.out.print(dado + " - ");
            fim = aux;
            aux = aux.getProx();
        }
        aux = fim;
    }
}
