public class Program3 {

    /**
     * 3. Write a Java program to print the following grid
     */

    public static void main(String[] args) {
        char simbol = '-';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(simbol + " ");
            }
            System.out.println();
        }
    }
}
