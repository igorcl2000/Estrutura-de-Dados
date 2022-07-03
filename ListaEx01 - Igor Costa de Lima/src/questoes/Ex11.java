package questoes;

import classes.Livro;

import java.util.Scanner;
import java.util.Stack;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();
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
            pilha.push(l);
        }
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha.peek());
        System.out.println(pilha.push(new Livro("dadada", "dasds", 2022, "andre")));
        System.out.println(pilha.pop());
        System.out.println(pilha);

    }
}
