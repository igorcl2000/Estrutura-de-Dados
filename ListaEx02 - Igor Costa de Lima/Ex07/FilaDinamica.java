package Ex07;

public class FilaDinamica {

    private No cabeca;
    private No cauda;
    private int tamanho;

    public void enfileirar(No novoElemento) {
        if (cabeca == null) {
            cabeca = novoElemento;
            cauda = cabeca;
        } else {
            novoElemento.setProx(cauda.getProx());
            novoElemento.setAnt(cauda);
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
        tamanho++;
    }

    public No desenfileirar() {
        No aux = cabeca;
        if (aux == null) {
            return null;
        }

        cabeca = cabeca.getProx();
        cabeca.setAnt(null);
        aux.setAnt(null);
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void print() {
        No aux = this.cabeca;
        No fim = null;
        while (aux != null) {
            String dado = aux.getDado();
            System.out.print(dado + " - ");
            fim = aux;
            aux = aux.getProx();
        }
        System.out.print("\nENTRADA\n\n");
        aux = fim;
        while (aux != null) {
            String dado = aux.getDado();
            System.out.print(dado + " - ");
            aux = aux.getAnt();
        }
        System.out.print("\nInvertido\n\n");
    }
}
