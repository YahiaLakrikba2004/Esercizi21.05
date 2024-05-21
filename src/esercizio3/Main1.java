package esercizio3;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Inserisci una stringa (per uscire, inserisci \":q\"):");
            String input = scanner.nextLine();


            if (input.equals(":q")) {
                System.out.println("Uscita dal programma.");
                break;
            }


            String[] caratteri = input.split("");
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < caratteri.length; i++) {
                output.append(caratteri[i]);
                if (i < caratteri.length - 1) {
                    output.append(", ");
                }
            }
            System.out.println("Caratteri speciali separati dalla virgola: " + output.toString());
        }

        scanner.close();
    }
}
