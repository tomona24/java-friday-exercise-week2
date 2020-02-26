package Week2.Arrays;

import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        int locate = 0;
        Random rand = new Random();
        System.out.print("Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(" " + arr[i]);
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > max) {
                max = arr[k];
                locate = k;
            }
        }

        System.out.println("\n\nThe largest value is " + max);
        System.out.println("It is in slot " + locate);


    }
}
