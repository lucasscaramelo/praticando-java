package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public void criandoVetorAltura() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // usuario digita um inteiro
        double[] vect = new double[n];

        for (int i=0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i < vect.length; i++) {
            sum += vect[i];
        }
        double avg = sum / vect.length;
        System.out.printf("%.2f%n", avg);

        sc.close();
    }

    public void vetorParaQuartosDeEstudantes() {

    }
}
