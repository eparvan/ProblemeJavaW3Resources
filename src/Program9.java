import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program9 {
    /*
     * 9. Write a Java program to insert an element (specific position) into an array.
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
        System.out.print("Elementul ce trebuie inserat =");
        Integer numInsert = myInput.nextInt();
        System.out.print("pozitia de inserare =");
        int poz=myInput.nextInt();
        tabelInitial.add(poz,numInsert);
        System.out.println("Tabelul initial:\n" + tabelInitial);
    }
}
