package br.ufpb.dcx.brito.gustavo.Exercicios.Exercicio8.Som;

public class TestaCaixaDeSom {
    public static void main(String [] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini" ));
        caixa.adicionarEmissor(new Cachorro("Tob"));
        caixa.adicionarEmissor(new Tambor("grande", "TamborMAX"));
        caixa.adicionarEmissor(new Tambor("pequeno", "tamboriladas"));

        caixa.tocarTodosOsEmissores();
    }

}
