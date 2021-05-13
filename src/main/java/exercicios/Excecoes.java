package exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

    public void trabalhandoComExecoes() {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("\nPrograma tratou as exceptions...");

        sc.close();
    }

    public void blocoFinally() {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro abrir arquivo: " + e.getMessage());
        } finally { // executa mesmo que o try nao der certo
            if (sc != null) {
                sc.close();
            }
            System.out.println("finally executado");
        }
    }

    public void excecoesPersonalizadas() {
        
    }
}
