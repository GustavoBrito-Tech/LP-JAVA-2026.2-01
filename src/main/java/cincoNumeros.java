import java.util.Scanner;
import java.util.Arrays;

public class cincoNumeros {
    public static void main(String [] args){
        int[] lista = new int [5];
        Scanner leitor = new Scanner (System.in);
        for( int k =0; k < lista.length; k++){
            System.out.println("Digite um número inteiro qualquer: ");
            int numero = Integer.parseInt(leitor.nextLine());
            lista[k] = numero;
        }
        int menorNumero = 10000;
        for(int i = 0; i < lista.length; i++ ){
            if(lista[i] < menorNumero){
                menorNumero = lista[i];
            }
        }
        System.out.println("Lista: " + Arrays.toString(lista) + " Menor número da lista: " + menorNumero);

    }
}
