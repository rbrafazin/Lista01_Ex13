import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double a = sc.nextDouble();
        double ph = (72.7 * a) - 58;
        double pm = (62.1 * a) - 44.7;

        System.out.printf("Seu peso ideal caso você seja Homem é %.2f kg\n", ph);
        System.out.printf("Seu peso ideal caso você seja Mulher é %.2f kg", pm);
        sc.close();
    }

}
