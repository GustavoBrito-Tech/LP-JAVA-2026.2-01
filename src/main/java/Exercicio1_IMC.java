import javax.swing.JOptionPane;

public class Exercicio1_IMC {
    public static void main (String [] args) {
        String nome = JOptionPane.showInputDialog("Olá! Qual seu nome? ");
        String pesoStr = JOptionPane.showInputDialog("Digite o seu peso em KG: ");
        Double peso = Double.parseDouble(pesoStr) ;

        String alturaStr = JOptionPane.showInputDialog("Digite o sua altura em Metros: ");
        Double altura = Double.parseDouble(alturaStr);

        Double imc = peso * (altura * altura);

        JOptionPane.showMessageDialog (null,"Olá " + nome + "! Este é o valor do seu IMC " + imc);

    }
}
salvo