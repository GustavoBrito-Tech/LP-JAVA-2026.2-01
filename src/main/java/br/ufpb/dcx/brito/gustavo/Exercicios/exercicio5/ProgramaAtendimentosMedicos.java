package br.ufpb.dcx.brito.gustavo.Exercicios.exercicio5;

import java.util.Scanner;
public class ProgramaAtendimentosMedicos {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos atendimentos você quer cadastrar?");
        int quantAtendimentos = Integer.parseInt(leitor.nextLine());
        AtendimentoMedico [] atendimentosMedicos = new AtendimentoMedico [quantAtendimentos];
        for (int k=0; k< quantAtendimentos; k++) {
            System.out.println("Qual o código do atendimento?");
            String codigo= leitor.nextLine();
            System.out.println("Qual a data do atendimento?");
            String diaAtendimento = leitor.nextLine();
            System.out.println("Qual a categoria do atendimento? CLÍNICA,"
                    + "ORTOPÉDICO ou CARDIOLÓGICO");
            String categoriaAtendimento = leitor.nextLine();
            atendimentosMedicos[k]  = new AtendimentoMedico(codigo, diaAtendimento, categoriaAtendimento);
        }
        imprimeAtendimentos(atendimentosMedicos);
        leitor.close();

        System.out.print("Quantidade de atendimentos Cardiológicos: " + AtendimentoMedico.contaQuantidadeDeAtendimentoCardiologicos(atendimentosMedicos));
    }

    private static void imprimeAtendimentos(AtendimentoMedico[] atendimentos) {
        System.out.println("Atendimentos feitos:");
        int i=0;
        while (i< atendimentos.length) {
            System.out.println("Ficha:"+atendimentos[i].getCodigoAtendimento()+", Data:"+atendimentos[i].getDiaAtendimento()
                    +", Categoria:"+       atendimentos[i].getCategoriaAtendimento());
            i+=1;
        }

    }
}
