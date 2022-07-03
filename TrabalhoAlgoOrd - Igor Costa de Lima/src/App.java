package src;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int tam = 1000;

        int[] vetorDesord = new int[tam];
        Random rand = new Random();

        for (int i = 0; i < vetorDesord.length; i++) {
            vetorDesord[i] = rand.nextInt(tam);
        }

        System.out.println("Tamanho do Vetor: " + tam);

        // Bolha
        int[] vetorBolha = Arrays.stream(vetorDesord).toArray();
        long tempInicialBolha = System.currentTimeMillis();
        System.out.println("========================================================");
        SimplesOrd.bubbleSort(vetorBolha);
        long tempFinalBolha = System.currentTimeMillis();
        long tempExecucaoBolha = tempFinalBolha - tempInicialBolha;
        System.out.printf("Algoritmo Bolha\nTempo de execução: %.3f ms%n\n", tempExecucaoBolha / 1000d);

        // SelectionSort
        int[] vetorSelection = Arrays.stream(vetorDesord).toArray();
        long tempoInicialSelection = System.currentTimeMillis();
        System.out.println("========================================================");
        SimplesOrd.selectionSort(vetorSelection);
        long tempoFinalSelection = System.currentTimeMillis();
        long tempoExecucaoSelection = tempoFinalSelection - tempoInicialSelection;
        System.out.printf("Algoritmo Seletion\nTempo de execução: %.3f ms%n\n", tempoExecucaoSelection / 1000d);

        // InsertionSort
        int[] vetorInsertion = Arrays.stream(vetorDesord).toArray();
        long tempoInicialInsertion = System.currentTimeMillis();
        System.out.println("========================================================");
        SimplesOrd.insertionSort(vetorInsertion);
        long tempoFinalInsertion = System.currentTimeMillis();
        long tempoExecucaoInsertion = tempoFinalInsertion - tempoInicialInsertion;
        System.out.printf("Algoritmo Inserção\nTempo de execução: %.3f ms%n\n", tempoExecucaoInsertion / 1000d);

        // QuickSort
        int[] vetorQuickSort = Arrays.stream(vetorDesord).toArray();
        System.out.println("========================================================");
        long tempoInicialQuickSort = System.currentTimeMillis();
        SofisticadosOrd.quicksort(vetorQuickSort);
        long tempoFinalQuickSort = System.currentTimeMillis();
        long tempoExecucaoQuickSort = tempoFinalQuickSort - tempoInicialQuickSort;
        System.out.printf("Algoritmo quickSort\nTempo de execução: %.3f ms%n\n", tempoExecucaoQuickSort / 1000d);

        // MergeSort
        int[] vetorMergeSort = Arrays.stream(vetorDesord).toArray();
        System.out.println("========================================================");
        long tempoInicialMergeSort = System.currentTimeMillis();
        SofisticadosOrd.mergesort(vetorMergeSort);
        long tempoFinalMergeSort = System.currentTimeMillis();
        long tempoExecucaoMergeSort = tempoFinalMergeSort - tempoInicialMergeSort;
        System.out.printf("Algoritmo MergeSort\nTempo de execução: %.3f ms%n\n", tempoExecucaoMergeSort / 1000d);
        System.out.println("========================================================");

    }
}
