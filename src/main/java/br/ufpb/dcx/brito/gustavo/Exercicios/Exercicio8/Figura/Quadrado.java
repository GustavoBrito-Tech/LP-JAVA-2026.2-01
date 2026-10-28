package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio8.Figura;

public class Quadrado implements Figura {
    double lado;

    @Override
    public double calcularArea(){
        return lado *lado;
    }

    public Quadrado (double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
}
