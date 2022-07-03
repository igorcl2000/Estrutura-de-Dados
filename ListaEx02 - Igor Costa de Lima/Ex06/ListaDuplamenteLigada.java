package Ex06;

public class ListaDuplamenteLigada {

    private No cabeca;
    private No cauda;
    public int contador;

    public void adicionar(No novoElemento) {
        if (this.cabeca == null) {
            this.cabeca = novoElemento;
            this.cauda = this.cabeca;
        } else {
            this.cauda.setProx(novoElemento);
            novoElemento.setAnt(this.cauda);
            this.cauda = novoElemento;
        }
    }

    public void removerLast() {
        if (cauda.getProx() == null) {
            cauda.setDado(null);
        }
    }

    public void contem() {
        No aux = this.cabeca;
        contador = 0;
        while (aux != null) {
            String dado = aux.getDado();
            System.out.print(dado + " - ");
            aux = aux.getProx();
            contador++;
        }
        System.out.println("\nContem: " + contador + " Elementos");
        System.out.print("===================\n\n");
    }
}
