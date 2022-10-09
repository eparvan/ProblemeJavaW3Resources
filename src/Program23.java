import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Program23 {
    /*
     * 23. Write a Java program to test the equality of two arrays.
     * */
    public static void main(String[] args) {
        List<Integer> listaUnu = new ArrayList<Integer>();
        List<Integer> listaDoi = new ArrayList<Integer>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente din lista initiala n=");
        int n = myInput.nextInt();
        for (int i = 0; i < n; i++) {
            int randIntUnu = ThreadLocalRandom.current().nextInt(1, 10);
            listaUnu.add(randIntUnu);
            int randIntDoi = ThreadLocalRandom.current().nextInt(1, 10);
            listaDoi.add(randIntDoi); // pentru aceleasi elemente: randIntUnu
        }
        System.out.println("Tabelul unu:\n" + listaUnu);
        System.out.println("Tabelul doi:\n" + listaDoi);
        if (listaUnu.equals(listaDoi)){
            System.out.println("Listele au aceleasi elemente");
        }else{
            System.out.println("Listele au diferite elemente");
        }

    }
}
