package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            Random rnd = new Random();
            arr1[i] = rnd.nextInt(100) + 1;
            arr2[i] = arr1[i];
        }
        arr1[9] = -7;

        System.out.print("Array 1:");
        for ( int k = 0; k < arr1.length; k++) {
            System.out.print(" " + arr1[k]);
        }
        System.out.println();
        System.out.print("Array 2:");
        for ( int j = 0; j < arr1.length; j++) {
            System.out.print(" " + arr2[j]);
        }
    }
}
