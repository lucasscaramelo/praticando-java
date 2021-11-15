package livro.arrays;

import livro.enums.SituacaoNotas;

public class ManipulaNotas {

    public void manipulandoArrayNotas() {
        float[] notas = {3.0f, 3.9f, 8.3f, 2.8f, 6.4f, 5.1f, 9.3f};

        SituacaoNotas[] situacaoNotas = new SituacaoNotas[notas.length];

        for (int i=0; i<notas.length; i++) {
            if (notas[i] < 5f) {
                situacaoNotas[i] = SituacaoNotas.REPROVADO;
            }else if (notas[i] < 7f) {
                situacaoNotas[i] = SituacaoNotas.EXAME;
            }else {
                situacaoNotas[i] = SituacaoNotas.APROVADO;
            }
        }

        for (int p=0; p< notas.length;p++) {
            System.out.println("Nota: " + notas[p]+ "Situação: "+situacaoNotas[p]);
        }
    }

}
