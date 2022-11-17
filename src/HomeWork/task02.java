package HomeWork;

public class task02 {
    public static void main(String[] args) {
        int years = 18;

        if (years < 6) {
            System.out.println("ребенок идет в детсад");
            System.out.println("ребенок идет в детсад.");
        } else if (years >= 6 && years < 17) {
            System.out.println("ребенок идет младшую школу");
        } else if (years >= 11 && years < 17) {
            System.out.println("ребенок идет в cреднюю школу");
        } else {
            System.out.println("ребенок идет в университет");
        }
    }
}
