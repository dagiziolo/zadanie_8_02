import java.util.Scanner;

public class DigitTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int number = Math.abs(scan.nextInt()); //w przypadku podania ujemnej nie uwzględnaimy w sumie "-"
        System.out.println("Suma cyfr podanej liczby to: " + Digit.sumDigits(number));
    }
}
