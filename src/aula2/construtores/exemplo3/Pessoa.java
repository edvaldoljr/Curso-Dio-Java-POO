package aula2.construtores.exemplo3;

public class Pessoa {
    public  Pessoa(String nome){  // Faz com que se nao passar um nome ao instanciar ira dar erro
        this.nome = nome;
    }
    private String nome;

    public  String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
