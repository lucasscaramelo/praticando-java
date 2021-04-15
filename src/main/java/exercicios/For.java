package exercicios;

import java.util.Scanner;

public class For {

    Scanner sc = new Scanner(System.in);

    public void repetirFluxo() {
        int n = sc.nextInt();
        int soma = 0;

        for (int i=0; i < n; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);
        sc.close();
    }

    public void contagemRegressiva() {
        for (int i=4; i>=0; i--) {
            System.out.println(i);
        }
    }

    public void numerosImpares() {
        int x = sc.nextInt();

        for (int i=1; i <= x; i++) {
            if ( (i % 2) != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    public void valoresDentroFora() {
        int n = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i=0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                dentro += 1;
            } else {
                fora += 1;
            }
        }

        System.out.println("Dentro: "+ dentro);
        System.out.println("Fora: "+ fora);
        sc.close();
    }

    public void casosDeTeste() {
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }

    public void calcularDivisores() {

    }
}
