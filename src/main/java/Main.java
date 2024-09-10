

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Erstes hier gehört zu Fib.java
        //Scanner scanner = new Scanner(System.in);

        //Fib fibInstance = new Fib();

        //while (true) {
        //System.out.println("Gib 'next' ein, um die nächste Fibonacci-Zahl auszugeben:");

        //String input = scanner.nextLine();

        //if (input.equalsIgnoreCase("next")) {
        // fibInstance.printNextFibonacci();
        //  }  else if (input.equalsIgnoreCase("exit")) {
        // System.out.println("Programm beendet.");
        //break;

        //} else {
        // System.out.println("Ungültige Eingabe. Gib 'next' ein.");
        //}

        //}

        //Hier beginnt Aufgabe 2:
        //ArrayIterable arrayIterable = new ArrayIterable();
        //List<String> ObstList = arrayIterable.getObstList();
        //  for (String obst : ObstList) {
        //System.out.println(obst);
        //}
        // }

        // Hier beginnt Aufgabe 3:
        IterableString iterableString = new IterableString("Hallo Welt");
        for (char c : iterableString) {
            System.out.print(c + " ");
        }
    }
}








