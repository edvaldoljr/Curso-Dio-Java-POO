package aula2.construtores.exercico;

public class Carro {

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    private String marca;
    private String modelo;
    private String variante;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String getVariante() {
        return variante;
    }

    public int getAno() {
        return ano;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

}
