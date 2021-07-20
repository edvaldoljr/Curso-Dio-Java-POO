package aula3.encapsulamento.exemplo01;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;

    public  Pessoa(String nome, int dia, int mes, int ano){
        this.nome = nome;
        this.dataDeNascimento = LocalDate.of(ano,mes,dia);
    }
     public int calculaIdade(){
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
     }
     public  String getNome(){
        return  nome;
     }
     public LocalDate getDataDeNascimento(){
        return dataDeNascimento;
     }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
