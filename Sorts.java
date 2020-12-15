public class Sorts {
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    for (int i=data.length-1; i>=0; i--) {
      for (int j=0; j<data.length; j++) {
        if (data[j]>data[j+1]) {
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1]=temp;
        }
      }
    }
  }

}
