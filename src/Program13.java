import java.util.*;
import java.util.stream.Collectors;

public class Program13 {

    /*
    * 13. Write a Java program to find the duplicate values of an array of string values.
    * */
    public static void main(String[] args){
        List<String> tabelIntial = Arrays.asList("luni", "colegiu","vara", "luni", "vara", "cahul");
        System.out.println("Tabelul initial:\n"+tabelIntial);
        Set<String> elementDuplicate = tabelIntial.stream()
                .filter(element-> Collections.frequency(tabelIntial,element)>1)
                .collect(Collectors.toSet());
        System.out.println("Elementele ce se repeta:\n"+elementDuplicate);
    }
}
