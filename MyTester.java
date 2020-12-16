import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class MyTester {
  public static void main(String[] args) {
    //small array test
    // int[] arr = new int[]{1,3,2,6,5};
    // Sorts.bubbleSort(arr);
    // System.out.println(Arrays.toString(arr));

    //random array test
    Random rng = new Random();
    for (int i=0; i<20; i++) {
      int size = rng.nextInt(100);
      boolean passes = false;
      System.out.println("Tester case "+ i);
      int[] tester = new int[size];
      int[] correctarr = new int[size];
      for (int j=0; j<size; j++) {
        Random ele = new Random();
        int element = ele.nextInt(100);
        tester[j]=element;
        correctarr[j]=element;
      }
      Sorts.bubbleSort(tester);
      Arrays.sort(correctarr);
      String myresult = Arrays.toString(tester);
      String correct = Arrays.toString(correctarr);
      if (myresult.equals(correct)) passes=true;
      if (passes=true) System.out.println(" passes.");
      else System.out.println(" fails.");
    }
  }
}
