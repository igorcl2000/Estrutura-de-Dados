package Ex05;

public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada<>();
        lista.adicionar(new No("01", null));
        lista.adicionar(new No("03", null));
        lista.adicionar(new No("04", null));
        lista.adicionar(new No("06", null));
        lista.contem();
    }
}
