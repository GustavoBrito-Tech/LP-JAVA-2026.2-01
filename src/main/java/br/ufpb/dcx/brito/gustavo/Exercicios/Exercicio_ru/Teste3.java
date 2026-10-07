package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio_ru;

import java.util.Scanner;
public class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR"); String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());
        }
// TO-DO: Código a acrescentar //
    //CÓDIGO QUANTIDADE DE REFEIÇÕES ALMOÇO REALIZADAS //
        int totalAlmoco = 0;
        for(int i = 0; i<quantidadeRefeicoes; i++){
            if(refeicoes[i].getTipoRefeicao().equalsIgnoreCase("ALMOÇO")){
                totalAlmoco += 1;
            }
            System.out.println("Quantidade de Refeições do tipo (ALMÇO) realizadas: " + totalAlmoco);
        }

    //HOUVE REFEIÇÃO CAFÉ?//
        for(int i = 0; i<quantidadeRefeicoes; i++){
            boolean RefeicaoCafe = false;
            if(refeicoes[i].getTipoRefeicao().equalsIgnoreCase("CAFÉ")){
                RefeicaoCafe = true;
            }
            if (RefeicaoCafe){
                System.out.println("Alguma refeição do tipo (CAFÉ) foi realizada: SIM ");
            }
            else {
                System.out.println("Alguma refeição do tipo (CAFÉ) foi realizada: NÃO ");
            }
        }


        System.out.printf("FIM DO PROGRAMA");
        leitor.close();
    }// fim do main
} // fim da classe Teste 3
