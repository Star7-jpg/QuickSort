import java.io.BufferedReader;
import java.io.InputStreamReader;

import files.Files;

public class QuickSort {

    static int divideArray(int array[], int left, int right){
        int pivote = array[right];
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (array[j] <= pivote) {
                i++;
                int auxiliar = array[i];
                array[i] = array[j];
                array[j] = auxiliar;
            }
        }
        int auxiliar2 = array[i + 1];
        array[i + 1] = array[right];
        array[right] = auxiliar2;

        return i + 1;
    }

    static void sortArray(int array[], int left, int right){
        if (left < right) {
            int index = divideArray(array, left, right);
            sortArray(array, left, index - 1);
            sortArray(array, index + 1, right);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Files archivo = new Files();

        String filename;
        int[] array;

        System.out.println("Escriba el nombre del archivo de datos");
        filename = bufer.readLine();
        array = archivo.fileToIntArray(filename);

        System.out.println("Arreglo sin ordenar");
        archivo.printArray(array);

        int n = array.length;

        sortArray(array, 0, n - 1);
        
        System.out.println();
        System.out.println("Ordenar arreglo: ");
        archivo.printArray(array);
    }
}