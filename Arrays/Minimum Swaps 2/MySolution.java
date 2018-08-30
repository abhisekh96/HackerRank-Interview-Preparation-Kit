
/*
The logic is very simple. Only available elements in the array are from "1 to n " .

step 1 : check if each array index is filled is current value . ( So, arr[i] ==i+1, since, index start from 0 , so need for increment of 1 as value is from 1 to n ).

step 2 : for the element not at its actual position. we simply replace the ith element with value at the (i-1)th position , as index is from 0 . and increase the count . And again decreasing the i of loop to check if again the value at ith position is (i+1) or not .
*/

import java.util.*;

class MySolution {
  public static void main(String[] args) {
    int[] array = { 3, 7, 6, 9, 1, 8, 10, 4, 2, 5 };
    int counter = 0, n = array.length;
    for (int i = 0; i < n; i++) {
      if (array[i] == (i + 1)) {
        continue;
      }
      int temp = array[array[i] - 1];
      array[array[i] - 1] = array[i];
      array[i] = temp;
      counter++;
      i--;
    }
    System.out.println("The minimum no of swaps it will take to sort the array in ascending order is: " + counter);
  }
}