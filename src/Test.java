import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Box array[] = new Box[3];
        for (int i = 0; i <= array.length - 1; i++) {
            boolean error = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj pojemność skrzyni");
            int userBoxCapacity = 0;
            boolean full = true;
            do {
                try {
                    userBoxCapacity = scanner.nextInt();
                    error = false;
                } catch (InputMismatchException ex) {
                    System.err.println("Podana wartość nie jest liczbą, podaj liczbę");
                    scanner.nextLine();
                }
            }
            while (error);
            scanner.nextLine();
            System.out.println("Podaj kolor skrzyni");
            String colour = scanner.nextLine();
            error = true;
            System.out.println("Czy skrzynia jest pełna? podaj true/false");

            do {
                try {
                    full = scanner.nextBoolean();
                    error = false;
                } catch (InputMismatchException ex) {
                    System.err.println("Podana wartość nie jest true/false podaj true/false");
                    scanner.nextLine();
                }
            }
            while (error);

            do {
                Box box = new Box(userBoxCapacity, colour, full);
                if (!(box.equals(array[0])) && (!(box.equals(array[1])))) {
                    array[i] = box;
                    error = false;
                } else {
                    System.err.println("Podane dane są duplikatem aktualnego obiektu w tablicy wpisz coś innego");
                    i--;
                    break;
                }
            } while (error);
        }

    }

}
