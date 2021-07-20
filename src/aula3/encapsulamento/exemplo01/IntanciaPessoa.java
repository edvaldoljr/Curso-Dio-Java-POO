package aula3.encapsulamento.exemplo01;

public class IntanciaPessoa {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Edvaldo", 03,04,1994);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataDeNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Junior");

        System.out.println(eu.getNome());
    }


}
