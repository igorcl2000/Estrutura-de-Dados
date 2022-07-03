package questoes;

import classes.Contato;
import estruturas.Lista;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // Criando Lista
        Lista<Contato> lista = new Lista<>(20);
        // Criando Scanner de Entrada
        Scanner entrada = new Scanner(System.in);
        // Condições de Repetição
        for (int i = 0; i < 30; i++) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Telefone: ");
            String telefone = entrada.next();
            System.out.println("Email: ");
            String email = entrada.next();
            Contato c = new Contato(nome, telefone, email);
            lista.adiciona(c);
        }
        // Impressãp de Resultado
        System.out.println(lista);
    }
}
