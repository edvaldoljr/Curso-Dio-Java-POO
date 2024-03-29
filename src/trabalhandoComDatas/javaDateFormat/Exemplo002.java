package trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com SimpleDateFormat
 */
public class Exemplo002 {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 24/08/2021

    }
}