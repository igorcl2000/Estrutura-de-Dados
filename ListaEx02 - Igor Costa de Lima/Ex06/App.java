package Ex06;

public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.adicionar(new No("01", null, null));
        lista.adicionar(new No("03", null, null));
        lista.adicionar(new No("04", null, null));
        lista.adicionar(new No("06", null, null));
        lista.contem();
        System.out.println("===================");
        lista.removerLast();
        lista.contem();

    }
}
