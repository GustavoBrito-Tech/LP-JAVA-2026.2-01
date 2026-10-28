package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio8.Som;

public class Tambor implements EmissorDeSom{
    String tamanho;
    String marca;

    @Override
    public String emitirSom(){
        return "TUM! TUM!";
    }

    public Tambor (String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String getTamanho (){
        return tamanho;
    }
    public String getMarca (){
        return marca;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
}
