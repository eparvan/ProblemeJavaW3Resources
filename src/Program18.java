import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program18 {

    /*
     * 18. Write a Java program to find the second smallest element in an array.
     * */
    public static void main(String[] args) {
        List<Integer> tabelInitial = new ArrayList<Integer>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente tabelul initial n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 10);
            tabelInitial.add(randInt);
        }
        System.out.println("Tabelul initial:\n" + tabelInitial);
        Collections.sort(tabelInitial);//minim pe pozitia 0
       System.out.println("Al doilea element minima: " + tabelInitial.get(1));
    }

}
