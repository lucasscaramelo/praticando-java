package exercicios;

import java.util.Map;
import java.util.TreeMap;

public class OperacoesMap {

    public void exemploMapParaArmazenarCookies() {

        Map<String, String> cookies = new TreeMap<>(); // O TreeMap lista por oderm alfabetica

        // abaixo usamos chave e valor, o Map é baseado em chave e valor
        cookies.put("username", "Lucas"); // inserir elemento no map
        cookies.put("email", "lucas@teste.com");
        cookies.put("fone", "9888999");

        //cookies.remove("email"); // remove a chave email

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ":" + cookies.get(key));
        }

    }

}
