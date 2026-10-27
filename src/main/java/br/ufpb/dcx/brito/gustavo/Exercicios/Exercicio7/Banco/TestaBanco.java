package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio7.Banco;
import java.util.ArrayList;

public class TestaBanco {
    public static void main(String [] args) {
        BancoList meuBanco = new BancoList("Ayla's Bank","123/321",new  ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3")); //... ...

        meuBanco.abrirConta("100.947.354-12", "000-0", "030-3", 0.0);
        meuBanco.transferir("222-2", "333-3", "000-0", "030-3", 100);

        System.out.println("O saldo da Conta de Número: 000-0 e Agência: 030-3 é R$" + meuBanco.consultarSaldoDeConta("000-0", "030-3"));

        ArrayList<Conta> contasNegativas = meuBanco.pesquisarContasComSaldoNegativo(meuBanco.getContas());

        for(Conta c : contasNegativas){
            System.out.println( "SALDO NEGATIVO!: " + c.toString());
        }
    }
}
