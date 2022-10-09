import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program15 {
    /*
    * 15. Write a Java program to find the common elements between two arrays of integers.
    * */

    public static void main(String[] args) {
        List<Integer> tabelUnu = new ArrayList<>();
        List<Integer> tabelDoi = new ArrayList<>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente tabelul unu n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 100);
            tabelUnu.add(randInt);
        }
        System.out.println("Tabelul unu:\n" + tabelUnu);

        System.out.print("\nNumar elemente tabelul doi n=");
        n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 100);
            tabelDoi.add(randInt);
        }
        System.out.println("\nTabelul doi:\n" + tabelDoi);

        List<Integer> tabelModificat = new ArrayList<>();
        for (int i = 0; i < tabelUnu.size(); i++) {
            for (int j = 0; j < tabelDoi.size(); j++) {
                if (tabelDoi.get(j).equals(tabelUnu.get(i))) {
                    tabelModificat.add(tabelDoi.get(j));
                }
            }
        }
        System.out.println("\nElementele ce se repeta:\n" + tabelModificat);
    }
}
