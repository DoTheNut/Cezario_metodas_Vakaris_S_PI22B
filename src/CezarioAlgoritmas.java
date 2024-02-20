import java.util.Scanner;

public class CezarioAlgoritmas {

    public static final char[] Abecele = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String Uzsifravimas(String text, int key) {
        StringBuilder result = new StringBuilder();
        int n = Abecele.length;  // simbolių (raidžių) skaičius

        for (char character : text.toCharArray()) {

                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int index = (character - base + key + n) % n;  // pritaikyta formule
                result.append(Abecele[index]);

        }
        return result.toString();
    }

    public static String Desifravimas(String text, int key) {
        StringBuilder result = new StringBuilder();
        int n = Abecele.length;

        for (char character : text.toCharArray()) {

                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int index = (character - base - key + n) % n;  // pritaikyta dešifravimo formule
                result.append(Abecele[index]);

        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = null;
        int key;
        int i = 5;
        while(i != 0) {
            System.out.println("Pasirinkite: ");
            System.out.println("0. Išeiti");
            System.out.println("1. Užšifravimas");
            System.out.println("2. Išifravimas");

            i = scanner.nextInt();
            
        
            switch(i) {
                case 1:

                    System.out.println("Įveskite raktą (Cezario atveju poslinkį): ");
                    key = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Įveskite tekstą: ");
                    text = scanner.nextLine();

                    // Šifravimas
                    String uzsifruotasTekstas = Uzsifravimas(text, key);
                    System.out.println("Užkoduotas tekstas: " + uzsifruotasTekstas);
                    break;
                case 2:
                    System.out.println("Įveskite Cezario poslinkį): ");
                    key = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Įveskite tekstą: ");
                    text = scanner.nextLine();

                // Dešifravimas
                String desifruotasTekstas = Desifravimas(text, key);
                System.out.println("Atkoduotas tekstas: " + desifruotasTekstas);
                break;

                case 0:
                    System.out.println("Išeinama");
                    break;

                default: System.out.println("Neteisingas pasirinkimas !");
                    break;
            }
        }
    }
}