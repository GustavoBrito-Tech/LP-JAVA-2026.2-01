package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio_ru;
import java.util.Scanner;

public class AlmocoRU {
    public static void main(String [] args){
      Scanner leitor = new Scanner(System.in);
      double totalValorAlmocos = 0;
      System.out.println("Digite a quantidade de Refeições do tipo Almoço: ");
      int N = leitor.nextInt();
      for (int k = 0; k < N; k++ ) {
          System.out.println("Digite o valor do seu Almoço: ");
          double valorAlmoco = leitor.nextDouble();
          totalValorAlmocos += valorAlmoco;
      }
      System.out.println("O R.U gastou cerca de R$"+ totalValorAlmocos +" com almoços.");
    }
}
