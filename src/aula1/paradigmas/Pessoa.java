package aula1.paradigmas;

public class Pessoa {
    private String nome = "Edvaldo";
    public String getNome(){
        return nome;
    }
    public String falarmeuProprioNome(){
        return "Olá meu nome é " + getNome();
    }
    public String andar(){
        return "Estou caminhando....";
    }
}
