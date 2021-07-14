package aula2.construtores.exercico;

public class Carro {

    String marca(String marca) {
        this.marca = marca;
        return marca;
    }

    String modelo(String modelo) {
        this.modelo = modelo;
        return modelo;
    }

    Integer ano(Integer ano) {
        this.ano = ano;
        return ano;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
