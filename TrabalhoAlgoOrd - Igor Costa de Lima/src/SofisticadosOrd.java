package src;

public class SofisticadosOrd {
    public static void quicksort(int[] vetor) {
        quicksort(vetor, 0, vetor.length - 1);
    }

    private static void quicksort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int indicePivo = dividir(vetor, inicio, fim);
            quicksort(vetor, inicio, indicePivo - 1);
            quicksort(vetor, indicePivo + 1, fim);
        }
    }

    private static int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void mergesort(int[] vetor) {
        mergesort(vetor, new int[vetor.length], 0, vetor.length - 1);
    }

    private static void mergesort(int[] vetor, int[] temp, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergesort(vetor, temp, esquerda, meio);
            mergesort(vetor, temp, meio + 1, direita);
            merge(vetor, temp, esquerda, meio + 1, direita);
        }

    }

    private static void merge(int[] vetor, int[] temp, int esquerda, int direita, int indiceFinalDireita) {

        int indicefinalEsquerda = direita - 1;
        int indiceTemp = esquerda;
        int elementoNumero = indiceFinalDireita - esquerda + 1;

        while (esquerda <= indicefinalEsquerda && direita <= indiceFinalDireita) {
            if (vetor[esquerda] <= vetor[direita]) {
                temp[indiceTemp] = vetor[esquerda];
                indiceTemp++;
                esquerda++;
            } else {
                temp[indiceTemp] = vetor[direita];
                indiceTemp++;
                direita++;
            }
        }

        while (esquerda <= indicefinalEsquerda) {
            temp[indiceTemp] = vetor[esquerda];
            indiceTemp++;
            esquerda++;
        }

        while (direita <= indiceFinalDireita) {
            temp[indiceTemp] = vetor[direita];
            indiceTemp++;
            direita++;
        }

        for (int i = 0; i < elementoNumero; i++) {
            vetor[indiceFinalDireita] = temp[indiceFinalDireita];
            indiceFinalDireita--;
        }

    }
}
