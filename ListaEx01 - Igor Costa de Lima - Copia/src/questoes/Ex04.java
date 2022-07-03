package questoes;

import estruturas.Lista;

public class Ex04 {
    public static void main(String[] args) {
        // Criando Lista
        Lista<String> lista = new Lista<>(10);
        // Adicionando Elementos
        lista.adiciona("A");
        lista.adiciona("B");
        // Declaração de Teste
        try {
            lista.removePrimeiro();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // Impressão de Resultado
        System.out.println(lista);

    }
}
