package exercicios;

import java.util.Scanner;

public class OperadoresBitwise {
    /*
    Operadores Bitwise:
        & = Operação "E" bit a bit
        | = Operação "OU" bit a bit
        ^ = Operação "OU-exclusivo" bit a bit
     */

    public void numeros() {
        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
    }

    public void validarBit() {
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("O sexto bit é 1 - True");
        }else {
            System.out.println("O sexto bit é 0 - False");
        }

        sc.close();
    }
}
