package Lab10;

public class SelectionSort {

	/** Creates a new instance of SelectionSort */
   public SelectionSort() {
   }

   /* A simple SelectionSort algorithm
    * pre-condition: have an unsorted int array
    * post-condition: returns a sorted array (least to greatest)
    * inputs: int array
    * outputs: int array
    * special conditions: none
    */
   public int[] basicSelectionSort(int[] x) {
       for (int i = 0; i < x.length; ++i) {

    	   int index = i;

           for (int j= i+1; j < x.length; ++j) {
               if (x[index] > x[j]) {
                   index = j;
               }
           }

           int small = x[index];
           x[index] = x[i];
           x[i] = small;
       }
       return x;
   }

}
