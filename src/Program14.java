import java.util.*;
import java.util.stream.Collectors;

public class Program14 {

    /*
     * 14. Write a Java program to find the common elements between two arrays (string values).
     * */
    public static void main(String[] args) {
        List<String> tabelulUnu = Arrays.asList("luni", "colegiu", "vara", "luni", "vara", "cahul");
        List<String> tabelulDoi = Arrays.asList("marti", "colegiu", "iarna", "joi", "Java", "C#", "cahul");
        System.out.println("Tabelul unu:\n" + tabelulUnu);
        System.out.println("\nTabelul doi:\n" + tabelulDoi);
        List<String> tabelModificat = new ArrayList<String>();
        for (int i = 0; i < tabelulUnu.size(); i++) {
            for (int j = 0; j < tabelulDoi.size(); j++) {
                if (tabelulDoi.get(j).equals(tabelulUnu.get(i))) {
                    tabelModificat.add(tabelulDoi.get(j));
                }
            }
        }
        System.out.println("Elementele ce se repeta:\n" + tabelModificat);
    }
}
