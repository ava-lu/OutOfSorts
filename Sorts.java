import java.util.Arrays;
public class Sorts {
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    for (int i=0; i<data.length; i++) {
      for (int j=0; j<data.length-1-i; j++) {
        if (data[j]>data[j+1]) {
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1]=temp;
        }
      }
    }
  }
  public static void selectionSort(int[] data) {
    for (int i=0; i<data.length; i++) {
      for (int j=i+1; j<data.length; j++) {
        int temp = data[i];
        int other = data[j];
        if (other<temp) {
          data[i]=other;
          data[j]=temp;
        }
      }
    }
  }
  public static void insertionSort(int[] data) {
    for (int i=1; i<data.length; i++) {
      int temp = data[i];
      int j=i-1;
      while (j>=0 && temp<data[j]) {
        data[j+1]=data[j];
        j--;
      }
        data[j+1]=temp;
    }
  }

}
