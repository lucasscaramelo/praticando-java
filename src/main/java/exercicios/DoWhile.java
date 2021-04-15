package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

    Scanner sc;

    public void temperaturaF() {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);
        char resp;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();

            double f = 9.0 * c / 5.0 + 32.0; // equação da conversão em fahrenheit

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }

}
