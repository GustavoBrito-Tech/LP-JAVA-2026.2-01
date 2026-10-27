package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio7.Banco;

import java.util.ArrayList;

public class BancoList {
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public ArrayList getContas(){
        return this.contas;
    }

    public String toString() {
        return "Banco " + this.nome + " de CNPJ " + this.cnpj + " e que tem " + this.contas.size() + " contas";
    }

    public void transferir(String numContaO, String numAgO, String numContaD, String numAgD, double valor) {
        Conta contaOrigem = null;
        Conta contaDestino = null;
        for ( Conta p : contas){
            if (p.getNumeroConta().equals(numContaO) && p.getNumeroAgencia().equals(numAgO)){
                contaOrigem = p;
            }
            if (p.getNumeroConta().equals(numContaD) && p.getNumeroAgencia().equals(numAgD)){
                contaDestino = p;
            }
        }
        if(contaOrigem != null && contaDestino != null) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println( "Transferência de R$" + valor + " realizadapara a conta de número " +contaDestino.getNumeroConta() + " e agência " + contaDestino.getNumeroAgencia());
        }
        else {
            System.out.println("ERRO!:Conta de Origem ou de destino não foram encontradas");
        }
    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta novaConta = new Conta(cpfTitular, numConta, numAgencia, saldoInicial);
        this.contas.add(novaConta);
    }


    public ArrayList<Conta> pesquisarContasComSaldoNegativo(ArrayList<Conta> contas) {
        ArrayList<Conta> contasNegativas = new ArrayList();
        for(Conta p : contas){
            if(p.getSaldo() < 0.0){
                contasNegativas.add(p);
            }
        }
        return contasNegativas;
    }


    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        double saldo = 0;
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
            }
        }
        return saldo;
    }

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        // TODO: IMPLEMENTAR
        return 0.0;
    }

    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        for (Conta p : this.contas) {
            if (p.getNumeroConta().equals(numConta) && (p.getNumeroAgencia().equals(numAgencia))) {
               p.setSaldo(p.getSaldo() + valor);
               return p.getSaldo();
            }
        }
        return 0.0;
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        // TODO: IMPLEMENTAR
        return null;
    }
}