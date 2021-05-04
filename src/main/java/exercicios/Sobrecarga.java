package exercicios;

public class Sobrecarga {

    private String nome;
    private String sobrenome;

    public Sobrecarga() {
        // construtor comum
    }

    public Sobrecarga(String nome) {
        this.nome = nome; // sobrecarga com o atributo nome, a palavra this referencia o atributo da classe e não o parametro esperado
    }

    // sobrecarga com todos os atributos
    public Sobrecarga(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


}
