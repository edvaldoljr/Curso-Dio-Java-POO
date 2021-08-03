package aula4.exemploThis;

public class Carro extends Veiculo {
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
