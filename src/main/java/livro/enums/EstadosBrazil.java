package livro.enums;

public enum EstadosBrazil {

    ACRE ("Acre", "AC", "Rio Branco", 152581.4),
    ALAGOAS ("Alagoas", "AL", "Maceio", 27767.7),
    AMAPA ("Amapa", "AP", "Macapa", 142814.6),
    AMAZONAS ("Amazonas", "AM", "Manaus", 1570745.7),
    BAHIA ("Bahia", "BA", "Salvador", 34242.3),
    CEARA ("Ceara", "CE", "Fortaleza", 43434.8),
    DISTRITO_FEDERAL ("Distrito Federal", "DF", "Brasilia", 5565.4),
    ESPIRITO_SANTO ("Espirito Santo", "ES", "Vitoria", 2324242.3),
    GOIAS ("Goias", "GO", "Goiania", 32323.5),
    MARANHAO ("Maranhao", "MA", "Sao Luis", 989746.3),
    MATO_GROSSO ("Mato Grosso", "MT", "Cuiaba", 83738.7),
    MATO_GROSSO_SUL ("Mato Grosso do Sul", "MS", "Campo Grande", 373734.6),
    MINAS_GERAIS ("Minas Gerais", "MG", "Belo Horizonte", 76757.3),
    PARA ("Para", "PA", "Belem", 87363.4),
    PARAIBA ("Paraiba", "PB", "Joao Pessoa", 9823.2),
    PARANA ("Parana", "PR", "Curitiba", 12123.2),
    PERNAMBUCO ("Pernambuco", "PE", "Recife", 9918.1),
    PIAUI ("Piaui", "PI", "Teresina", 12123.4),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ", "Rio de Janeiro", 565656.5),
    RIO_GRANDE_NORTE ("Rio Grande do Norte", "RN", "Natal", 767676.7),
    RIO_GRANDE_SUL ("Rio Grande do Sul", "RS", "Porto Alegre", 87887.87),
    RONDONIA ("Rondonia", "RO", "Porto Velho", 9889.9),
    RORAIMA ("Roraima", "RR", "Boa Vista", 12872.6),
    SANTA_CATARINA ("Santa Catarina", "SC", "Florianopolis", 55454.3),
    SAO_PAULO ("Sao Paulo", "SP", "Sao Paulo",23232.2 ),
    SERGIPE ("Sergipe", "SE", "Aracaju", 12212.8),
    TOCANTINS ("Tocantins", "TO", "Palmas", 423324.6);

    private final String nome;
    private final String sigla;
    private final String capital;
    private final double area;

    private EstadosBrazil(String n, String s, String c, double a) {
        nome = n;
        sigla = s;
        capital = c;
        area = a;
    }

    @Override
    public String toString() {
        return "EstadosBrazil{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", capital='" + capital + '\'' +
                ", area=" + area +
                '}';
    }
}
