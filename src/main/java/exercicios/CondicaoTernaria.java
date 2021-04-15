package exercicios;

public class CondicaoTernaria {

    /*
        Condição ternária faz uma validação como se fosse um if, o
        resultao é retornado com verdadeiro ou falso, assim conforme
        o retorno a condição determina o que será aplicado
     */

    private double price = 25.0;
    private double desconto = (price < 20.0) ? price * 0.1 : price * 0.5;

    public void aplicaCondicaoTernaria() {
        System.out.println(desconto);
    }

    public String condicaoTernariaDentroMetodo(boolean resultado) {


        return (resultado) ? "Ativo" : "Inativo";
    }

}
