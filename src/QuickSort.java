public class QuickSort {
    public static void main(String[] args) throws Exception {
        int[] array = {3,1,7,9,6,8,4,2,5};
        
        

        for (int i = 0; i < array.length/2; i++) {
            System.out.println(array[i]);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        for (int j = array.length-1; j > array.length/2; j--) {
            System.out.println(array[j]);
        }

        // System.out.println(array[array.length-1]);
        // System.out.println(array[array.length/2]);
    }
}
