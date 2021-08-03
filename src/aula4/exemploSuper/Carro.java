package aula4.exemploSuper;

public class Carro extends Veiculo {
    public Carro(String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal);
    }
    public Carro(String modelo, String marca, double valorVenal, int quantidadesDePortas){
        super(modelo, marca, valorVenal);
        this.quantidadesDePortas = quantidadesDePortas;
    }

    private int quantidadesDePortas;

    public int getQuantidadesDePortas() {
        return quantidadesDePortas;
    }

    public void setQuantidadesDePortas(int quantidadesDePortas) {
        this.quantidadesDePortas = quantidadesDePortas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}
