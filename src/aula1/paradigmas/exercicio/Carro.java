package aula1.paradigmas.exercicio;

public class Carro {

    //Atributos
    private String Motorista = "Morista";
    public String getMotorista(){
        return Motorista;
    }
    private String pessoas3 = "3 pessoas ";
    public String getPessoas3(){
        return pessoas3;
    }
    private String pessoas2 = "2 pessoas ";
    public String getPessoas2(){
        return pessoas2;
    }

    //Metodos
    public String motorista(){
        return "Apenas o   " + getMotorista();
    }
    public String entrar(){
        return "Entrando no carro " + getPessoas3();
    }
    public String sair(){
        return "Saindo do carro " + getPessoas2();
    }



}
