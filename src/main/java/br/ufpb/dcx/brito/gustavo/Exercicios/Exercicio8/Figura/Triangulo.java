package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio8.Figura;

public class Triangulo implements Figura {
    private double altura;
    private double base;

    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }

    public Triangulo (double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }
    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
}
