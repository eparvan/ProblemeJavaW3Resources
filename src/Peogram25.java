import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Peogram25 {

    /*
     * 25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
     * */
    public static void main(String[] args) {
        List<Integer> listaUnu = new ArrayList<Integer>();
        List<Integer> listaDoi = new ArrayList<Integer>();
        List<Integer> listaTrei = new ArrayList<Integer>();
        Scanner myInput = new Scanner(System.in);
        System.out.print("Numar elemente din lista unu n=");
        int n1 = myInput.nextInt();
        for (int i = 0; i < n1; i++) {
            int randIntUnu = ThreadLocalRandom.current().nextInt(1, 10);
            listaUnu.add(randIntUnu);
        }
        System.out.print("Numar elemente din lista doi n=");
        int n2 = myInput.nextInt();
        for (int i = 0; i < n2; i++) {
            int randIntDoi = ThreadLocalRandom.current().nextInt(1, 10);
            listaDoi.add(randIntDoi);
        }
        System.out.print("Numar elemente din lista trei n=");
        int n3 = myInput.nextInt();
        for (int i = 0; i < n3; i++) {
            int randIntTrei = ThreadLocalRandom.current().nextInt(1, 10);
            listaTrei.add(randIntTrei);
        }
        Collections.sort(listaUnu);
        Collections.sort(listaDoi);
        Collections.sort(listaTrei);
        System.out.println("Tabelul unu:\n" + listaUnu);
        System.out.println("Tabelul doi:\n" + listaDoi);
        System.out.println("Tabelul trei:\n" + listaTrei);
        int i=0;
        int j=0;
        int k=0;
        List<Integer> elementeComune = new ArrayList<>();
        while(i<n1 && j<n2&&k<n3){
            if(listaUnu.get(i) == listaDoi.get(j) && listaDoi.get(j) == listaTrei.get(k)){
                elementeComune.add(listaUnu.get(i));
                i++;j++;k++;
            }
            else if (listaUnu.get(i)<listaDoi.get(j)){
                i++;
            }
            else if(listaDoi.get(j)<listaTrei.get(k)){
                j++;
            }
            else {
                k++;
            }
        }
        if (elementeComune.size()>0) {
            System.out.println("\nElemene comune: " + elementeComune);
        }
        else{
            System.out.println("Nu sunt elemente comune.");
        }
    }
}
