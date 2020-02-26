package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Random rand = new Random();
            int num = rand.nextInt(100) + 1;
            list.add(num);
        }

        System.out.println("ArrayList: " + list);
    }

}
