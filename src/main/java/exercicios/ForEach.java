package exercicios;

public class ForEach {

    public void nomeVetor() {
        String[] vect = new String[] {"Lucas", "Evelyn", "Toddy"};

        for (String obj : vect){ // percorre vetor vect e atribui os nomes a string obj
            System.out.println(obj);
        }
    }

}
