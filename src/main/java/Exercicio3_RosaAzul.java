import java.util.Scanner;

public class Exercicio3_RosaAzul {
    public static void main(String [] args){
        Integer numStrings = 11;
        Integer quantAzul = 0;
        Integer quantRosa = 0;
        String [] listaAzulRosa = new String[11];
        for(Integer k = 0; k< numStrings; k++){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite 'rosa' ou 'azul': ");
            String palavra = leitor.nextLine();
            listaAzulRosa[k] = palavra;
            if(palavra.equals("rosa")){
                quantRosa++;
            }
            else {
                quantAzul++;
            }
        System.out.println(" Quantidade de Rosas: "+quantRosa+ " Quantidade de Azuis: " + quantAzul);
        }

    }


}
