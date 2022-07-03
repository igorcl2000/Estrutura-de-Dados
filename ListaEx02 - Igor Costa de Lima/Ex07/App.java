package Ex07;

public class App {
    public static void main(String[] args) throws Exception {

        FilaDinamica fila = new FilaDinamica();
        fila.enfileirar(new No("1", null, null));
        fila.enfileirar(new No("4", null, null));
        fila.enfileirar(new No("5", null, null));
        fila.enfileirar(new No("2", null, null));
        fila.print();
    }
}
