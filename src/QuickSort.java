import java.io.BufferedReader;
import java.io.InputStreamReader;

import files.Files;

public class QuickSort {

    int dividirArray(int array[], int left, int right){
        int pivote = array[right];
        int i = (left - 1);

        for (int j = 0; j < right; j++) {
            if (array[j] <= pivote) {
                i++;
                int auxiliar = array[i];
                array[i] = array[j];
                array[j] = auxiliar;
            }
        }
        int auxiliar2 = array[i+1];
        array[i+1] = array[right];
        array[right] = auxiliar2;

        return i+1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Files archivo = new Files();

        String filename;
        int[] array;

        System.out.println("Escriba el nombre del archivo de datos");
        filename = bufer.readLine();
        array = archivo.fileToIntArray(filename);

        archivo.printArray(array);
    }
}