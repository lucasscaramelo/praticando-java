package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public void listaNomes() {
        List<String> list = new ArrayList<>();

        list.add("Rick");
        list.add("Morty");
        list.add("Toddy");
        list.add(2, "Tedd"); // recebe a posicao da lista e o elemento para adicionar

        list.remove("Rick"); // remove dado da lista
        list.remove(1); // remove a posicao 1 da lista

        for (String x: list) {
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'M'); // predicado(lambda)
        list.indexOf("Rick"); // procura elemento

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // predicado(lambda)
        for (String x: result) {
            System.out.println(x);
        }

        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // procura elementos com a letra A e tras o primeiro, se nao existir o elemento retorna null
        System.out.println(nome);
    }
}
