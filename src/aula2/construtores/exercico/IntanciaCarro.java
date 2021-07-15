package aula2.construtores.exercico;

public class IntanciaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro ("Honda","Civic",2021);
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        carro.setVariante("8v");
        System.out.println(carro.getVariante());
    }
}