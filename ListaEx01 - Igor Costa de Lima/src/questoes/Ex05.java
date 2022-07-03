package questoes;

import estruturas.Lista;

public class Ex05 {
    public static void main(String[] args) {
        // Criando Lista
        Lista<String> lista = new Lista<>(10);
        // Adicionando Elementos
        lista.adiciona("A");
        lista.adiciona("B");
        // Impressão de Resultado
        System.out.println(lista);
        // Função Limpar
        lista.limpar();
        // Impressão de Resultado
        System.out.println(lista);

    }
}
