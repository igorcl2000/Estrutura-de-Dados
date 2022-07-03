package Ex08;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.empilhar(new No("Igor", null));
        pilha.print();
        System.out.println(pilha);
    }
}
