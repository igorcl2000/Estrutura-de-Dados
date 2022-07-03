package Ex03;

public class App {
    public static void main(String[] args) throws Exception {

        FilaComPrioridade<Contato> fila = new FilaComPrioridade<>();
        fila.enfileirar(new Contato("Igor", "61991184088", 3));
        fila.enfileirar(new Contato("Heitor", "16999979178", 1));
        fila.enfileirar(new Contato("Arthur", "16993963701", 2));
        fila.enfileirar(new Contato("Lara", "40028922", 1));
        fila.enfileirar(new Contato("André", "3498142972", 1));

        System.out.println(fila);

    }
}
