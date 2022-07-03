package src;

public class SimplesOrd {

    // metodo de ordenação bolha
    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            boolean temTroca = false;
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    temTroca = true;
                }
            }
            if (!temTroca) {
                break;
            }
        }
    }

    // algoritmo de seleção
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndice = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[minIndice] > vetor[j]) {
                    minIndice = j;
                }
            }
            if (i != minIndice) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndice];
                vetor[minIndice] = temp;
            }
        }
    }

    // algoritmo inserção
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int elementoInsert = vetor[i];
            int insertPosicao = i;
            for (int j = insertPosicao - 1; j >= 0; j--) {
                // elementoInsert é deslocado para a direita
                if (elementoInsert < vetor[j]) {
                    vetor[j + 1] = vetor[j];
                    insertPosicao--;
                } else {
                    break;
                }
            }
            vetor[insertPosicao] = elementoInsert;
        }
    }
}
