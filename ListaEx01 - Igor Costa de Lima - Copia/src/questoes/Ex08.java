package questoes;

import estruturas.Pilha;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Criando Lista
        Pilha<Integer> pilha = new Pilha<>();
        // Criando Scanner de Entrada
        Scanner entrada = new Scanner(System.in);
        // Condições de Repetição
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = entrada.nextInt();
            if (numero % 2 == 0) {
                pilha.empilhar(numero);
            } else {
                if (pilha.estaVazia()) {
                    System.out.println("Pilha está vazia");
                } else {
                    pilha.desempilhar();
                }
            }
        }
        // Condiçôes
        while (!pilha.estaVazia()) {
            System.out.println(pilha.desempilhar());
        }
    }
}
