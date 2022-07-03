package Ex05;

public class ListaLigada<T> {
    private No cauda;
    private No cabeca;
    private int tamanhao;
    public int contador;

    public void adicionar(No novoElemento) {
        if (cabeca == null) {
            this.cabeca = novoElemento;
            this.cauda = cabeca;
            tamanhao++;
        } else {
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
    }

    public void contem() {
        No aux = cabeca;
        contador = 0;
        while (aux != null) {
            System.out.print(aux.getDado() + " - ");
            aux = aux.getProx();
            contador++;
        }
        System.out.println("\nContem: " + contador + " Elementos");
    }
}
