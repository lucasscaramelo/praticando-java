package exercicios;

import java.util.Scanner;

public class Whiles {

    Scanner sc = new Scanner(System.in);

    public void verificaSeValorEZero() {
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;  // soma recebe ele mesmo mais x
            x = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
    }

    public void validaCpf() {
        String cpf = sc.nextLine();

        while (cpf.length() == 11) {
            if (cpf.matches("[0-9]*")) {
                System.out.println("CPF Válido: " + cpf);
                cpf = sc.nextLine();
            } else {
                cpf = "0";
                System.out.println("Caracteres inválidos, digite novamente:");
                cpf = sc.nextLine();
            }
        }

        System.out.println("CPF Inválido");
        sc.close();
    }

    public void validaSenha() {
        int senha = sc.nextInt();

        while (!(senha == 2002)) {
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso liberado!");
        sc.close();
    }

    public void postoGasolina() {
        int produto = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (!(produto == 4)) {
            switch(produto) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("Favor inserir um código válido!");
            }
            produto = sc.nextInt();
        }

        System.out.println("Muito Obrigado!" +
                "\nAlcool: "+alcool+
                "\nGasolina: "+gasolina+
                "\nDiesel: " + diesel);

        sc.close();
    }

    public void planoCartesiano() {
        int cord = sc.nextInt();

        while (!(cord == 0 || cord == ' ')) {
            System.out.println("Insira uma nova coordenada:");
            cord = sc.nextInt();
        }

        System.out.println("Coordenada vazia!");
        sc.close();
    }
}
