package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datas {

    public void trabalhandoComDatas() throws ParseException {

        Date x1 = new Date(); // data e horario atual
        System.out.println(x1);

        // formatacao de datas
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data1 = format1.parse("25/06/2018");
        Date data2 = format2.parse("25/03/2020 13:00:17");

        System.out.println(data1 + "\n" + data2);  // apresentando datas

        // mostrando as datas conforme formatacao
        System.out.println(format1.format(data1));
        System.out.println(format2.format(data2));
    }

    public void manipulandoDateComCalendar() {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(format1.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d); // calendario com a data instanciada dentro

        cal.add(Calendar.HOUR_OF_DAY, 4);  // adiciona mais 4 horas no horario
        d = cal.getTime();

        System.out.println(d);


        // pegar a unidade de tempo (minuto, segundo ou hora)
        int min = cal.get(Calendar.MINUTE);
        System.out.println(min);

        // pegar mes
        int mes = 1 + cal.get(Calendar.MONTH); // O 0 representa janeiro, por isso somamos com 1
        System.out.println(mes);
    }

}
