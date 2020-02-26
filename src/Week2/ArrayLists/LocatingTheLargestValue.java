package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int randNum = rand.nextInt(100) + 1;
            list.add(randNum);
        }
        System.out.println("ArrayList: " + list);
        int max = 0;
        int locate = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                locate = i;
            }
        }
        System.out.println("The largest value is " + max + ", which is in slot " + locate);
    }
}
