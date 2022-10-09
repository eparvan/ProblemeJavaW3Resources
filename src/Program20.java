import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Program20 {
    /*
     * 20. Write a Java program to convert an array to ArrayList.
     * */
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente tabelul initial n=");
        int n = myInput.nextInt();
        Integer tabelInitial[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 10);
            tabelInitial[i] = randInt;
        }
        System.out.println("Tabelul initial:\n" + Arrays.toString(tabelInitial));
        ArrayList<Integer> listaInitial = new ArrayList<Integer>(Arrays.asList(tabelInitial));
        System.out.println("Lista initiala:\n" + listaInitial);
    }
}
