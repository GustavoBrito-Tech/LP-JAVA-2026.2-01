package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String [] args){
        ArrayList<Pessoa> pessoas = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        int k = 0;
        int quantPessoas = 5;
        while(k < quantPessoas){
            System.out.println("Digite seu nome: ");
            String nome = leitor.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = leitor.nextInt();

            leitor.nextLine();

            Pessoa novaPessoa = new Pessoa(nome, idade);
            pessoas.add(novaPessoa);

            k++;
        }

        for (Pessoa p : pessoas){
            if(p.ehDeMaior(p.getIdade())){
                System.out.println(p.getNome() + " é maior de idade!" );
            }
            else{
                System.out.println(p.getNome() + " é menor de idade!" );
            }
        }
    }

}
