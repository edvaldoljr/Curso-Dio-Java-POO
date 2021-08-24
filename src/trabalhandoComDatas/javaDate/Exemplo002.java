package trabalhandoComDatas.javaDate;

import java.util.Date;

//Exemplo de utilizaçao do construtor de passagem de parametros em milesegundos

public class Exemplo002 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
