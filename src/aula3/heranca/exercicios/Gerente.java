package aula3.heranca.exercicios;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calculaImposto(){
        return this.getSalario() * 0.1;
    }
}
