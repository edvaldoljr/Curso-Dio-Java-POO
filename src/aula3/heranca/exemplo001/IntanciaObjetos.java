package aula3.heranca.exemplo001;

public class IntanciaObjetos {
    public static void main(String[] args) {
        Carro carro =  new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setQuantidadeDePortas(4);

        Motocicleta motocicleta = new Motocicleta();
        motocicleta.setMarca("Yamaha");
        motocicleta.setModelo("TÉNÉRÉ");
        motocicleta.setCilindradas(250);

        System.out.println( ">>>> Motocicleta <<<<");
        System.out.println("Marca: " + motocicleta.getMarca() + "\n" + "Modelo: " + motocicleta.getModelo() + "\n" + "Cilindradas: " + motocicleta.getCilindradas());
        System.out.println(">>>> Carro <<<<");
        System.out.println("Marca: " + carro.getMarca() + "\n" + "Modelo: " + carro.getModelo() + "\n" + "Quantidades de portas: " + carro.getQuantidadeDePortas());
    }

}
