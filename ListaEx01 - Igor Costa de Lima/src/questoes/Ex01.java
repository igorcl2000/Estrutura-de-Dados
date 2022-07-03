package questoes;

import estruturas.Lista;

import java.util.ArrayList;

public class Ex01 {

    public static void main(String[] args) {
        // Criando Lista
        Lista<String> lista = new Lista<>(10);
        // Adicionando Elementos
        lista.adiciona("A");
        lista.adiciona("B");
        // Impressão de Resultado
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("C"));
    }
}
