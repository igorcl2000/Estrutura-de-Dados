package questoes;

import classes.Livro;
import estruturas.Pilha;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pilha<Livro> pilha = new Pilha<>(20);
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("isbn: ");
            String isbn = entrada.nextLine();
            System.out.println("ano lancamento: ");
            int ano = entrada.nextInt();
            entrada.nextLine();
            System.out.println("nome autor: ");
            String autor = entrada.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.empilhar(l);
        }
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.tamanho());
        System.out.println(pilha.topo());
        System.out.println(pilha.empilhar(new Livro("dadada", "dasds", 2022, "andre")));
        System.out.println(pilha.desempilhar());
        System.out.println(pilha);
    }
}
