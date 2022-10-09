import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program6 {

    /*
     * 6. Write a Java program to find the index of an array element.
     * */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("n=");
        int n = myInput.nextInt();
        int[] numArray = new int[n];
        System.out.print("Introdu numarul cautat: ");
        int numSearch = myInput.nextInt();
        boolean flag = false;
        int pozNumber = -1;
        for (int i = 0; i < n; i++) {
            numArray[i] = ThreadLocalRandom.current().nextInt(1, 100);
            if (numSearch == numArray[i]) {
                flag = true;
                pozNumber = i;
                break;
            }
        }
        System.out.println("Tabelul initial:\n" + Arrays.toString(numArray));
        if (flag) System.out.println("Numarul: " + numSearch + " se regaseste in tabel pe pozitia: " + pozNumber);
        else System.out.println("Numarul: " + numSearch + " lipseste in tabel.");

    }
}
