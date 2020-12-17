import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class MyTester {
  public static void main(String[] args) {
    //bubbleSort

    //small array test
    // int[] arr = new int[]{1,3,2,6,5};
    // int[] arr2 = new int[]{};
    // Sorts.bubbleSort(arr);
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(arr2));

    //random array test
    // Random rng = new Random();
    // for (int i=0; i<10; i++) {
    //   int size = rng.nextInt(100);
    //   boolean passes = false;
    //   System.out.println("Tester case "+ i);
    //   int[] tester = new int[size];
    //   int[] correctarr = new int[size];
    //   for (int j=0; j<size; j++) {
    //     Random ele = new Random();
    //     int element = ele.nextInt(100);
    //     tester[j]=element;
    //     correctarr[j]=element;
    //  }
      // Sorts.bubbleSort(tester);
      //System.out.println(Arrays.toString(tester));
      // Arrays.sort(correctarr);
      // if (Arrays.equals(tester, correctarr)) passes=true;
      // if (passes) System.out.println(" passes.");
      // else System.out.println(" fails.");
    // }

    //selectionSort
    int[] arr = new int[]{54,53,32,1,2};
    Sorts.selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
