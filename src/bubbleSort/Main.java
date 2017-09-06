package bubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] testArray = { 7, 2, 9, 1};
        boolean wasSwap = true;

        while(wasSwap == true){
            wasSwap = false;
            for (int j = 0; j < testArray.length -1 ; j++) {

                if(testArray[j] >testArray[j+1]){
                    int tmp = testArray[j];
                    testArray[j] = testArray[j+1];
                    testArray[j+1] = tmp;
                    wasSwap=true;
                }
            }
        }
        showingTable(testArray);
    }

    public static void showingTable(int[] array){
        System.out.println("Array sorted by bubble sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i + ", a[i] = " +array[i] );
        }
    }
}