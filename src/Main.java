import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in namn på formatet: efternamn, förnamn
        // Skriv ut: Hej FÖRNAMN

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ditt namn (efternamn, förnamn): ");
        String lastName = input.next();
        lastName = lastName.substring(0, lastName.length()-1);
        String firstName = input.next();

        System.out.println("Hej " + firstName.toUpperCase());
    }
}