package src;

public class ArvoreBinaria<T extends Comparable<T>> {
    private T val; /* Valor armazenado na raiz. */

    /* Referências para sub-árvores. */
    private ArvoreBinaria<T> esq, dir;

    /*
     * Construtor de árvore sem sub-ávores (dir = esq = null). É fornecido apenas o
     * valor da raiz.
     */
    public ArvoreBinaria(T valor) {
        val = valor;
        esq = null;
        dir = null;
    }

    /*
     * Construtor de árvore com sub-ávores. São fornecidos
     * o valor da raiz e as sub-árvores, que devem ter sido
     * construídas previamente.
     */
    public ArvoreBinaria(T valor, ArvoreBinaria<T> arvEsq, ArvoreBinaria<T> arvDir) {
        val = valor;
        esq = arvEsq;
        dir = arvDir;
    }

    /* Retorna o valor armazenado na raiz. */
    public T retornaVal() {
        return val;
    }

    /*
     * Retorna a sub-árvore esquerda
     * (ou null se não houver).
     */
    public ArvoreBinaria<T> retornaEsq() {
        return esq;
    }

    /*
     * Retorna a sub-árvore direita
     * (ou null se não houver).
     */
    public ArvoreBinaria<T> retornaDir() {
        return dir;
    }

    /* Modifica o valor armazenado na raiz. */
    public void defineVal(T valor) {
        val = valor;
    }

    /* Redefine a sub-árvore esquerda, apagando a antiga se houver. */
    public void defineEsq(ArvoreBinaria<T> filho) {
        esq = filho;
    }

    /* Redefine a sub-árvore direita, apagando a antiga se houver. */
    public void defineDir(ArvoreBinaria<T> filho) {
        dir = filho;
    }

    /* Imprime o conteúdo da árvore em pré-ordem */
    public void mostra() {
        System.out.print("(" + val);
        if (esq != null)
            esq.mostra();
        if (dir != null)
            dir.mostra();
        System.out.print(")");
    }

    /* Calcula e retorna a altura da árvore. */
    public int calculaAltura() {
        if ((esq == null) && (dir == null))
            return 0;

        int altEsq = 0, altDir = 0;

        if (esq != null)
            altEsq = esq.calculaAltura();

        if (dir != null)
            altDir = dir.calculaAltura();

        return 1 + Math.max(altEsq, altDir);
    }

    /* Calcula e retorna o maior valor contido na árvore. */
    public T calculaMaximo() {
        if ((esq == null) && (dir == null))
            return val;

        T maiorGeral, maiorEsq, maiorDir;

        if ((esq != null) && (dir == null)) {
            maiorGeral = esq.calculaMaximo();
        } else if ((esq == null) && (dir != null)) {
            maiorGeral = dir.calculaMaximo();
        } else {
            maiorEsq = esq.calculaMaximo();
            maiorDir = dir.calculaMaximo();

            if (maiorEsq.compareTo(maiorDir) > 0)
                maiorGeral = maiorEsq;
            else
                maiorGeral = maiorDir;
        }

        if (maiorGeral.compareTo(val) > 0)
            return maiorGeral;

        return val;
    }

    /*
     * Verifica se um valor está na árvore. Se estiver, retorna um ponteiro para o
     * o nó que tem esse valor. Caso contrário, retorna null.
     */
    public ArvoreBinaria<T> busca(T valor) {

        ArvoreBinaria<T> ret;

        /* Se é igual ao valor armazenado, não precisa procurar mais. O nó é a raiz. */
        if (valor.compareTo(val) == 0) {
            return this;
        }

        /* Senão, começa procurando na sub-árvore esquerda. */
        if (esq != null) {
            ret = esq.busca(valor);
            if (ret != null)
                return ret;
        }

        /*
         * Se chega a esse ponto, estará na árvore se, e somente se,
         * estiver na sub-árvore direita
         */
        if (dir != null)
            return dir.busca(valor);
        return null;
    }
}
