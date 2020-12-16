import java.util.Arrays;
public class MyTester {
  public static void main(String[] args) {
    int[] arr = new int[]{1,3,2,6,5};
    Sorts.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
