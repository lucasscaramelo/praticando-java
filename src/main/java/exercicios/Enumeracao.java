package exercicios;

public class Enumeracao {

    public void usandoEnumerador()  {
        Enumeradores status;
        status = Enumeradores.PROCESSING;

        System.out.println(status);
    }

    public void converterStringParaEnum() {
        Enumeradores status = Enumeradores.valueOf("Testando");
        System.out.println(status);
    }

}
