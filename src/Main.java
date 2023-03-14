import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in namn på formatet: efternamn, förnamn
        // Skriv ut: Hej FÖRNAMN

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ditt namn (efternamn, förnamn): ");
        String fullName = input.nextLine();

        int indexOfComma = fullName.indexOf(',');
        String firstName = fullName.substring(indexOfComma + 2);

        System.out.println("Hej " + firstName.toUpperCase());    }
}