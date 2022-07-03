package Ex04;

public class App {
    public static void main(String[] args) throws Exception {

        Pilha<Livros> pilha = new Pilha<>(1);
        pilha.empilhar(new Livros(
                " Livro001 ",
                " 1111 - 1111 - 1111 - 1111 ",
                " 01/01/2001 ",
                " Autor01 "));

        pilha.empilhar(new Livros(
                " Livro002 ",
                " 2222 - 2222 - 2222 - 2222 ",
                " 02/02/2002 ",
                " Autor02 "));

        pilha.empilhar(new Livros(
                "Livro003",
                " 3333 - 3333 - 3333 - 3333 ",
                " 03/03/2003 ",
                " Autor03 "));

        pilha.empilhar(new Livros(
                "Livro004",
                " 4444 - 4444 - 4444 - 4444 ",
                " 04/04/2004 ",
                " Autor04 "));

        pilha.empilhar(new Livros(
                "Livro005",
                " 5555 - 5555 - 5555 - 5555 ",
                " 05/05/2005 ",
                " Autor05 "));

        pilha.empilhar(new Livros(
                " Livro006 ",
                " 6666 - 6666 - 6666 - 6666 ",
                " 06/06/2006 ",
                " Autor06 "));

        // Metd. topo
        System.out.println("==================================");
        System.out.println("Livro do topo é:\n " + pilha.topo());
        System.out.println("==================================");

        // Metd. desempilhar
        System.out.println(pilha.toString());
        System.out.println("==================================");
        System.out.println("Valor a ser desempilhado:\n " + pilha.desempilhar());
        System.out.println("Pilha após o metodo desempilhar:\n " + pilha.toString());
        System.out.println(pilha.tamanho());
        System.out.println("==================================");

        // Metd. topo
        System.out.println("==================================");
        System.out.println("Livro do topo é:\n " + pilha.topo());
        System.out.println("==================================");

    }
}
