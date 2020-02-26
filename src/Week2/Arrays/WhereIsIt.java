package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.print("Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) + 1;
            System.out.print(" " + arr[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.print("\nValue to find: ");
        int num = in.nextInt();
        System.out.println();
        int counter = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == num) {
                System.out.println(String.format("%d is in slot %d.", num, k));
                counter++;
            }
        }
        if(counter == 0) {
            System.out.println(String.format("%d is not in the array.", num));
        }
    }
}
