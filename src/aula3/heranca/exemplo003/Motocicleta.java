package aula3.heranca.exemplo003;

public class Motocicleta extends Veiculo {
    public int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }
}
