package trabalhandoComDatas.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com DateFormat
 */
public class Exemplo001 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // 24/08/2021 02:44

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 24 de agosto de 2021 02:44


        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 24 de agosto de 2021 02:44:46 BRT

    }
}