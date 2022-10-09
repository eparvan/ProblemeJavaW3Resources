import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program19 {

    /*
     * 19. Write a Java program to add two matrices of the same size.
     * */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numarul de linii n=");
        int n = myInput.nextInt();
        System.out.print("Numarul de coloane m=");
        int m = myInput.nextInt();
        int tabelUnu[][] = new int[n][m];
        int tabelDoi[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j=0; j<m; j++) {
                int randInt = ThreadLocalRandom.current().nextInt(0, 5);
                tabelUnu[i][j]=randInt;
                int randIntDoi = ThreadLocalRandom.current().nextInt(0, 5);
                tabelDoi[i][j]=randIntDoi;
            }
        }
        System.out.println("Tabelul unu:\n");
        for (int i = 0; i < n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(tabelUnu[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTabelul doi:\n ");
        for (int i = 0; i < n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(tabelDoi[i][j]+" ");
            }
            System.out.println();
        }
        int sum[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j=0; j<m; j++) {
                sum[i][j]=tabelUnu[i][j]+tabelDoi[i][j];
            }
        }
        System.out.println("\nTabelul rezultant dupa adunare:\n");
        for (int i = 0; i < n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
