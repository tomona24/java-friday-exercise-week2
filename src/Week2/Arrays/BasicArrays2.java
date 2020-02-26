package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] slot = new int[10];
        for (int i = 0; i < slot.length; i++) {
            Random rand = new Random();
            slot[i] = rand.nextInt(100) + 1;
        }

        for (int k = 0; k < slot.length; k++) {
            System.out.println(String.format("Slot %d contains a %d",k,slot[k]));
        }
    }
}
