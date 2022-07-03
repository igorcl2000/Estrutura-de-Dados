package src;

public class App {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> a1 = new ArvoreBinaria<Integer>(1),
                a2 = new ArvoreBinaria<Integer>(2),
                a3 = new ArvoreBinaria<Integer>(3, a1, a2),
                a4 = new ArvoreBinaria<Integer>(4),
                a5 = new ArvoreBinaria<Integer>(5),
                a6 = new ArvoreBinaria<Integer>(6),
                a7 = new ArvoreBinaria<Integer>(7, a5, a6),
                a8 = new ArvoreBinaria<Integer>(8),
                a9 = new ArvoreBinaria<Integer>(9),
                a10 = new ArvoreBinaria<Integer>(10, a8, a9);

        a4.defineEsq(a3);
        a4.defineDir(a7);
        a4.mostra();
        System.out.println();

        ArvoreBinaria<Integer> a11 = a4.busca(3);
        if (a11 != null) {
            a11.defineVal(11);
            a11.defineEsq(a10);
        }
        a4.mostra();
        System.out.println();
    }
}
