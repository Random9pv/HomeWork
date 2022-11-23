package HomeWork2;

public class task1 {
    public static void main(String[] args) {

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String world1 = hi.trim() + " " + world.trim() + newLine;
        System.out.println(world1.repeat(3));
    }
}
