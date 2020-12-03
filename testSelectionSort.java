package Lab10;
/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
 @Test
 public void test() {
	// testPositive();
	 //testNegative();
	// testMixed();
	 testDuplicates();
 }

	 public testSelectionSort() {
	 }

   public void testPositive(){
       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = 7;
       arr[3] = 10;
       arr[4] = 2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 7;
       Sortedarr[2] = 8;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;

       SelectionSort temp1 = new SelectionSort();
       int[] sortedArray = temp1.basicSelectionSort(arr);

       assertArrayEquals(Sortedarr,sortedArray);


       /** add tests to check for this unit test **/
   }

   public void testNegative(){

	   int[] arr = new int[5];
       arr[0] = -8;
       arr[1] = -9;
       arr[2] = -7;
       arr[3] = -10;
       arr[4] = -2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = -10;
       Sortedarr[1] = -9;
       Sortedarr[2] = -8;
       Sortedarr[3] = -7;
       Sortedarr[4] = -2;

       SelectionSort temp1 = new SelectionSort();
       int[] sortedArray = temp1.basicSelectionSort(arr);

       assertArrayEquals(Sortedarr,sortedArray);
   }

   public void testMixed(){

  int[] arr = new int[5];
    arr[0] = -8;
    arr[1] = -15;
    arr[2] = 1;
    arr[3] = 0;
    arr[4] = 12;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = -15;
    Sortedarr[1] = -8;
    Sortedarr[2] = 0;
    Sortedarr[3] = 1;
    Sortedarr[4] = 12;

    SelectionSort temp1 = new SelectionSort();
    int[] sortedArray = temp1.basicSelectionSort(arr);

    assertArrayEquals(Sortedarr,sortedArray);
}

public void testDuplicates(){

  int[] arr = new int[5];
    arr[0] = 12;
    arr[1] = 12;
    arr[2] = -7;
    arr[3] = 1;
    arr[4] = 87;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = -7;
    Sortedarr[1] = 1;
    Sortedarr[2] = 12;
    Sortedarr[3] = 12;
    Sortedarr[4] = 87;

    SelectionSort temp1 = new SelectionSort();
    int[] sortedArray = temp1.basicSelectionSort(arr);

    assertArrayEquals(Sortedarr,sortedArray);
}


}
