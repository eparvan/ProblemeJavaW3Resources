import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

    /*
    * 1. Write a Java program to sort a numeric array and a string array
    * */
    public  static void main(String[] args){
       //Sortare tabel numeric
        Scanner myInput = new Scanner( System.in );
        System.out.print("n=");
        int n = myInput.nextInt();
        int[] numArray= new int[n];
        System.out.println("Introdu "+n+"  elemente ale tabelului:");
        for (int i=0; i<n; i++){
            System.out.print("numArray["+i+"]= ");
            numArray[i]=myInput.nextInt();
        }
        System.out.println("Tabelul initial:");
        for (int i=0; i<n; i++){
            System.out.print(numArray[i]+" ");
        }
        Arrays.sort(numArray);
        System.out.println("\nTabelul Sortat:");
        for (int i=0; i<n; i++){
            System.out.print(numArray[i]+" ");
        }

        //Sortare tabel din siruri de caractere

        Scanner cuvinteInput = new Scanner( System.in );

        int numCuvinte;
        System.out.print("\nIntrodu cuvinte separate cu un spatiu:");
        String[] stringArray=cuvinteInput.nextLine().split(" ");
        numCuvinte=stringArray.length;
        System.out.println("\nTabelul initial:");
        for (int i=0; i<numCuvinte; i++){
            System.out.print(stringArray[i]+" ");
        }
        Arrays.sort(stringArray);
        System.out.println("\nTabelul Sortat:");
        for (int i=0; i<numCuvinte; i++){
            System.out.print(stringArray[i]+" ");
        }
    }
}
