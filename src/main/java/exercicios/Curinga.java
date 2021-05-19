package exercicios;

import java.util.Arrays;
import java.util.List;

public class Curinga {

    public void mostrandoALista() {
        List<String> str = Arrays.asList("Teste", "Testando");
        listaComQualquerTipo(str);
    }

    private void listaComQualquerTipo(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
