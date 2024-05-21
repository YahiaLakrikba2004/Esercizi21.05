package esercizio1;

public class Main2 {

    public static boolean AnnoBisestile(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(AnnoBisestile(2000)); // true, divisibile per 400
        System.out.println(AnnoBisestile(1900)); // false, divisibile per 100 ma non per 400
        System.out.println(AnnoBisestile(2012)); // true, divisibile per 4 ma non per 100
        System.out.println(AnnoBisestile(2019)); // false, non divisibile per 4
    }
}
