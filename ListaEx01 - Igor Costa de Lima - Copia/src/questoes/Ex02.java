package questoes;

import estruturas.Lista;

public class Ex02 {
    public static void main(String[] args) {
        // Criando Lista
        Lista<String> lista = new Lista<>(10);
        // Adicionando Elementos
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        // Impressão de Resultado
        System.out.println("ultima o ocorrência do A " + lista.ultimaOcorrencia("A"));
        System.out.println("ultima o ocorrência do B " + lista.ultimaOcorrencia("B"));
        System.out.println("ultima ocorrência do C " + lista.ultimaOcorrencia("C"));
    }
}
