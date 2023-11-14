public class QuickSort {

    public static void main(String[] args) throws Exception {
        int[] array = {3,1,7,9,6,8,4,2,5};
        int pivote = array[array.length/2];  //El pivote es el valor en la posición 4 del arreglo

        System.out.println("Izquierda");
        for (int i = 0; i < array.length; i++) {  
            if (array[i] < pivote) {   //Si el valor de la casilla es menor que el pivote, se imprime
                System.out.print(array[i] + " ");
            } 
        }

        System.out.println();
        System.out.println("Derecha");
        for (int j = array.length-1; j > 0; j--) {
            if (array[j] > pivote) {   
                System.out.print(array[j] + " ");
            } 
        }
    }
}