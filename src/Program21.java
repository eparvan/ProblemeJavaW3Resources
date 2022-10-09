import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Program21 {


    /*
     * 21. Write a Java program to convert an ArrayList to an array.
     * */
    public static void main(String[] args) {
        List<Integer> listaInitial = new ArrayList<Integer>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente din lista initiala n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 10);
            listaInitial.add(randInt);
        }
        System.out.println("Tabelul initial:\n" + listaInitial);
        Integer[] tabel = new Integer[listaInitial.size()];
        listaInitial.toArray(tabel);
        System.out.println("Lista initiala: \n" + Arrays.toString(tabel));
    }
}
