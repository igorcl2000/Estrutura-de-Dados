package estruturas;

public class Pilha<T> {

    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Pilha() {
        this(10);
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

    public boolean empilhar(T elemento) {
        this.aumentarCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public T desempilhar() {
        if (this.estaVazia()) {
            return null;
        }
        // tamanho = tamanho - 1;
        return this.elementos[--tamanho];
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public int tamanho() {
        return tamanho;
    }

    private void aumentarCapacidade() {
        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

}
