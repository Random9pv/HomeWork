package HomeWork;

public class task03 {

    public static void main(String[] args) {

        boolean chicken = true;
        boolean veget = true;
        boolean sout = true;
        boolean testet = true;
        boolean sosig = true;
        boolean eggs = true;

        boolean zecar = chicken && veget && sout && testet && sosig && eggs;

        boolean olivie = veget && (sosig || chicken || eggs);

        if (zecar) {
            System.out.println("Цезарь готов");
        } else if (olivie) {
            System.out.println("оливье готов");
        } else if (veget) {
            System.out.println("Овощной салат готов");
        } else {
            System.out.println("нет ингридиентов для приготовления салата");


        }


    }
}
