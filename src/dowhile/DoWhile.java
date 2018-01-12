package dowhile;
/*This class shows the work of the do-while*/
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n >= 0); // второй вариант записи while (n-- > 0);
    }

}
