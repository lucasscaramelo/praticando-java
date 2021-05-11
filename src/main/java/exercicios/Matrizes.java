package exercicios;

import java.util.Scanner;

public class Matrizes {

    public void mostrarDiagonal() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n]; // instancia da matriz bidimensional(linhas[] e colunas[])

        // for para percorrer as linhas
        for (int i=0; i< mat.length; i++) {
            // for para percorrer as colunas
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }

        int count = 0;
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++; // recebe ela mais 1
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
