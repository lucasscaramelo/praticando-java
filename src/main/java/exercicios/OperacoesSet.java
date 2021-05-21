package exercicios;

import java.util.*;

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

    public void metodosSet() {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,8,10));

        // União
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // Intersecção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
