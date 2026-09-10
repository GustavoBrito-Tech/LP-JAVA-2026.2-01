import javax.swing.JOptionPane;

public class Execicio1_NomeCidade {
    public static void main (String[] args){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String cidade = JOptionPane.showInputDialog("Digite o sua cidade: ");

        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Que legal saber que você é de " + cidade);
    }
}
