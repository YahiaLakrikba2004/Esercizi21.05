package esercizio1;

public class Main1{

    public static boolean StringaPariDispari(String input) {

        return input.length() % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(StringaPariDispari("ciao"));
        System.out.println(StringaPariDispari("hello"));
        System.out.println(StringaPariDispari("Java"));

    }
}
