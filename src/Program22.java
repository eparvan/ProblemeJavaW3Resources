import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program22 {
    /*
     * 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
     * */
    public static void main(String[] args) {
        List<Integer> listaUnu = new ArrayList<Integer>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente din lista initiala n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randIntUnu = ThreadLocalRandom.current().nextInt(1, 10);
            listaUnu.add(randIntUnu);
        }
        System.out.println("Tabelul unu:\n" + listaUnu);
        System.out.print("Suma cautata: ");
        int sum = myInput.nextInt();
        System.out.println("Perechile de elemente cu suma cautata: ");
        for (int i = 0; i < n; i++) {
            int numUnu = listaUnu.get(i);
            for (int j = i + 1; j < n; j++) {
                int numDoi = listaUnu.get(j);
                if (numUnu + numDoi == sum) {
                    System.out.printf("\n(%d + %d = %d)", numUnu, numDoi, numUnu+numDoi);
                }
            }
        }
    }
}
