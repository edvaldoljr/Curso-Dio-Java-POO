package trabalhandoComDatas.javaDate;

import java.time.Instant;
import java.util.Date;

/**
 *  Exemplo de conversão entre Date e Instant
 */
public class Exemplo005 {
    public static void main(String[] args) {

        Date dataInicio = new Date(1629782080907L);
        System.out.println(dataInicio);
        // Tue Aug 24 02:14:40 BRT 2021

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2021-08-24T05:14:40.907Z
    }
}