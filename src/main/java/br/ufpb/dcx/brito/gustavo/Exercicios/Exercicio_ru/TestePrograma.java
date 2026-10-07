package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio_ru;
import br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio6_1.Produto;
import br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio6_1.ProgramaDescontos;

import java.util.Scanner;
public class TestePrograma {

    // QUESTÃO 4: O método main em uma classe separada para testes
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());

        // Cria o array de produtos
        Produto[] produtos = new Produto[quant];

        // Laço para preencher o array
        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();

            System.out.println("\nQual o nome do produto " + (k + 1) + "?");
            p.setNome(leitor.nextLine());

            System.out.println("Qual o preço original do produto " + (k + 1) + "?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));

            // ATENÇÃO: Como estamos em outra classe, chamamos usando "ProgramaDescontos.metodo"
            double valorComDesconto = ProgramaDescontos.calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar por este produto é R$ %.2f\n", valorComDesconto);

            produtos[k] = p;
        }

        // -------------------------------------------------------------
        // TESTE DOS MÉTODOS DAS QUESTÕES 2 E 3 (Chamadas Externas)
        // -------------------------------------------------------------

        // Chamada do metodo da Questão 2
        double totalDescontos = ProgramaDescontos.calcularSomatorioDescontos(produtos);

        // Chamada do mtodo da Questão 3
        String produtoCampeao = ProgramaDescontos.verificaProdutoComMaiorDesconto(produtos);

        // Impressão dos resultados exigidos pela Questão 4
        System.out.printf("\n================ RESUMO DO TESTE ================\n");
        System.out.printf("Somatório dos descontos dados: R$ %.2f\n", totalDescontos);
        System.out.println("Produto que obteve o maior desconto: " + produtoCampeao);
        System.out.println("=================================================");

        leitor.close();
    }
}