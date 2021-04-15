package exercicios;

public class OperacoesStrings {

    String original = "abcd EFGHIJ J ii  ";

    public void converteStringParaMinuscula() {
        String s01 = original.toLowerCase();
        System.out.println(s01);
    }

    public void converteStringParaMaiscula() {
        String s02 = original.toUpperCase();
        System.out.println(s02);
    }

    public void eliminarEspacosBrancoString() {
        String s03 = original.trim();
        System.out.println(s03);
    }

    public void cortarString() {

    }
}
