package aula3.heranca.exercicios;

public class InstanciaObjetos {
    public static void main(String[] args) {
        Funcionario novo = new Funcionario("Joao", 500);
        System.out.println(novo.calculaImposto());
        Funcionario gerente = new Gerente("Paulo", 500);
        System.out.println(gerente.calculaImposto());
        Funcionario atendente = new Atendente("edvaldo", 500);
        System.out.println(atendente.calculaImposto());
        Funcionario supervisor = new Supervisor("Mario", 500);
        System.out.println(supervisor.calculaImposto());

    }
}