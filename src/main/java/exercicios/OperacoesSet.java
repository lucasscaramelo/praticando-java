package exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OperacoesSet {

    public void exemploHashSet() {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook")); // verifica se existe o elemento no conjunto

        // imprime valores do set, o hashset é o mais rápido, mas ele não garante a ordem da lista
        for (String p: set) {
            System.out.println(p);
        }
    }

    public void exemploTreeSet() {

        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook")); // verifica se existe o elemento no conjunto

        // imprime e ordena os dados, o TreeSet faz essa ordenação
        for (String p: set) {
            System.out.println(p);
        }
    }

    public void exemploLinkedHashSet() {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook")); // verifica se existe o elemento no conjunto

        // imprime e mantem a ordem de insercao dos elementos, o LinkedHashSet mantem a ordem de acordo com a lista, ou seja, acb sera acb
        for (String p: set) {
            System.out.println(p);
        }
    }
}
