import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program10 {

    /*
    * 10. Write a Java program to find the maximum and minimum value of an array.
    * */
    public static void main(String[] args) {
        List<Integer> tabelInitial = new ArrayList<>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 100);
            tabelInitial.add(randInt);
        }
        System.out.println("Tabelul initial:\n" + tabelInitial);
        System.out.println("Elementul minim:" + Collections.min(tabelInitial));
        System.out.println("Elementul maxim:" + Collections.max(tabelInitial));
    }
}
