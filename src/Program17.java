import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Program17 {

    /*
     * 17. Write a Java program to find the second largest element in an array.
     * */
    public static void main(String[] args) {
        List<Integer> tabelInitial = new ArrayList<Integer>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente tabelul initial n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(1, 10);
            tabelInitial.add(randInt);
        }
        System.out.println("Tabelul initial:\n" + tabelInitial);
        Collections.sort(tabelInitial);//maxim pe pozitia n-1
        Collections.reverse(tabelInitial);//maxim pe pozitia 0
        System.out.println("Al doilea element maximal: " + tabelInitial.get(1));
    }
}
