package br.ufpb.dcx.brito.gustavo.projeto;

public class Usuario {
    String nome;
    String email;
    String senha;
    Integer idade;


    public Usuario (String nome, String email, String senha, Integer idade){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
    }
    public Usuario (){
        nome = "";
        email = "";
        senha = "";
        idade = 0;
    }

}
