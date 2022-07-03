package questoes;

import estruturas.Pilha;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            int num = entrada.nextInt();
            if (num == 0) {
                if (pilhaPar.estaVazia()) {
                    System.out.println("Pilha dos números pares vazia");
                } else {
                    pilhaPar.desempilhar();
                }

                if (pilhaImpar.estaVazia()) {
                    System.out.println("Pilha dos números impares vazia");
                } else {
                    pilhaImpar.desempilhar();
                }
            } else if (num % 2 == 0) {
                pilhaPar.empilhar(num);
            } else {
                pilhaImpar.empilhar(num);
            }
        }
        System.out.println("Pilha Par");
        while (!pilhaPar.estaVazia()) {
            System.out.println(pilhaPar.desempilhar());
        }

        System.out.println("Pilha Impar");
        while (!pilhaImpar.estaVazia()) {
            System.out.println(pilhaImpar.desempilhar());
        }
    }
}
