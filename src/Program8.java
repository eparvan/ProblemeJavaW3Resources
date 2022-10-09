import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program8 {
    /*
     * 8. Write a Java program to copy an array by iterating the array.
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
        List<Integer> tabelNou;
        tabelNou=tabelInitial;
        System.out.println("Tabelul nou:\n" + tabelNou);

    }

}
