package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio8.Som;

public class Cachorro implements EmissorDeSom{
    private String nome;

    @Override
    public String emitirSom(){
        return "AU AU!";
    }

    public Cachorro(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
//
