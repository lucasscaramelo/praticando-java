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
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        System.out.println(s04 + s05);
    }

    public void trocandoOValorString() {
        String s06 = original.replace('a', 'x'); // troca todos os caracteres "a" por "x"
        String s07 = original.replace("abc", "xyz"); // troca "abc" por "xyz"
        System.out.println(s06 + s07);
    }

    public void verificarOcorrenciaDaLetra() {
        int i = original.indexOf("bc");
        System.out.println("A ocorrência é na posição: " + i);
    }

    public void verificarUltimaOcorrencia() {
        int j = original.lastIndexOf("bc");
        System.out.println("Ultima ocorrência: " + j);
    }

    public void recortarString() {
        String s = "potato apple lemon";

        String[] vect = s.split(" "); // vetor de strings, o " " serve como separador
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        // sem variavel
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        // com variavel
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
