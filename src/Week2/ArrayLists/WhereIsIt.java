package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int randNum = rand.nextInt(50) + 1;
            list.add(randNum);
        }
        System.out.println("ArrayList: " + list);
        System.out.print("Value to find: ");
        int num = in.nextInt();
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i) == num) {
                counter = i;
                System.out.println(num + " is in slot " + i);
            }
        }
        if (counter == 0){
            System.out.println(num + " is not in the ArrayList.");
        }
    }
}
