package exercicios;

import java.util.Objects;

public class EqualsHashCode {

    /*
        Ambos os metodos são iguais, porem:
        Equals = acertivo, mas mais lento.
        HashCode = menos acertivo, mas mais rapido.

        A ideia é usar o HashCode para listas grandes e depois pegar os códigos
        e comparar os resultados com o Equals
     */

    private String teste;

    public void exemploEquals() {
        String a = "Lucas";
        String b = "Evelyn";
        System.out.println(a.equals(b)); // retorna true/false apos comparacao
    }

    public void exemploHashCode() {
        String a = "Lucas";
        String b = "Evelyn";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsHashCode)) return false;
        EqualsHashCode that = (EqualsHashCode) o;
        return Objects.equals(teste, that.teste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teste);
    }
}
