package questoes;

import classes.Contato;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Criando Lista
        LinkedList<Contato> lista = new LinkedList<>();
        // Criando Scanner de Entrada
        Scanner entrada = new Scanner(System.in);
        // Condições de Repetição
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Telefone: ");
            String telefone = entrada.next();
            System.out.println("Email: ");
            String email = entrada.next();
            Contato c = new Contato(nome, telefone, email);
            lista.add(c);
        }
        // Impressão de Resultado
        System.out.println(lista);
    }
}
