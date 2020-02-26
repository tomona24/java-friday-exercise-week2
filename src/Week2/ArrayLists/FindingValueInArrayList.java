package Week2.ArrayLists;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
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

        for (int i = 0; i < 10; i++) {
            if(list.get(i) == num){
                System.out.println(num + " is in the ArrayList.");
            }
        }
    }
}
