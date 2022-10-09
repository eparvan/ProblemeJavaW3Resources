import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program2 {

    /*
     * Write a Java program to sum values of an array
     * */
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.print("n=");
        int n = myInput.nextInt();
        int[] numArray = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numArray[i] = ThreadLocalRandom.current().nextInt(1, 100);
            sum += numArray[i];
        }
        System.out.println("Tabelul initial:\n" + Arrays.toString(numArray));

        System.out.println("\nSuma elementelor:" + sum);
    }
}
