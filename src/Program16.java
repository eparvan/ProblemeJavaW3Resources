import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Program16 {
    /*
    * 16. Write a Java program to remove duplicate elements from an array.
    * */
    public static void main(String[] args) {
        List<Integer> tabelInitial = new ArrayList<>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente tabelul initial n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 10);
            tabelInitial.add(randInt);
        }
        System.out.println("Tabelul initial:\n" + tabelInitial);
        List<Integer> tabelModificat = (tabelInitial.stream()
                .distinct()
                .collect(Collectors.toList()));
        //int numDuplicates = tabelInitial.size()-tabelModificat.size();
        //System.out.println("Au fost gasite " +numDuplicates +" dublicate!");
        System.out.println("Tabelul modificat:\n" + tabelModificat);
    }
}
