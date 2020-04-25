import java.util.Scanner;

public class Main {

    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Witaj w bibliotece! Co mogę dla ciebie zrobić?");
        while (true) {
            menu();
            int option = SCANNER.nextInt();
            switch (option) {
                case 1:
                    System.out.println("wyswietln Not implemented yet");
                    break;
                case 2:
                    System.out.println("Dodaj Not implemented yet");
                    break;
                case 3:
                    System.out.println("Usun Not implemented yet");
                    break;
                default:
                    System.out.println("Operacja o wybranym numerze nie istnieje");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("1) Wyświetl wszystkie książki");
        System.out.println("2) Dodaj książkę");
        System.out.println("3) Usuń książkę");
        System.out.println("Wybieram: ");
    }
}
