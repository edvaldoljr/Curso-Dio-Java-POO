package aula2.construtores.exercico;


public class IntanciaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro ();
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAno(2021);
        carro.setVariante("8v");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getVariante());
    }
}