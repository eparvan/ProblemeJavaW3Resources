import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Program7 {
    /*
     * 7. Write a Java program to remove a specific element from an array.
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
        System.out.print("Elementul ce trebuie sters =");
        Integer numRemove = myInput.nextInt();
        tabelInitial.removeAll(Collections.singleton(Integer.valueOf(numRemove)));
        System.out.println("Tabelul modificat:\n" + tabelInitial);
    }
}
