import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną n (n>1): ");
        int n = scanner.nextInt();
        scanner.close();
        String spaces = "";
        for (int i = 1; i <= n; i++) {
            spaces = String.format("%" + (n-i) + "s", "");
            System.out.println(spaces + String.format("%"+(2*i-1)+"s", "").replace(' ', '*'));
        }
    }
}
