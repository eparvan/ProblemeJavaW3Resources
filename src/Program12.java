import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Program12 {
    /*
     * 12. Write a Java program to find the duplicate values of an array of integer values.
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
        Set<Integer> duplicateElements = tabelInitial.stream()
                .filter(element-> Collections.frequency(tabelInitial,element)>1)
                .collect(Collectors.toSet());
        System.out.println("Elementele ce se repeta:\n"+duplicateElements);
    }
}
