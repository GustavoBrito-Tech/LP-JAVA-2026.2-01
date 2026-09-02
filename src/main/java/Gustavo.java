public class Gustavo {
    public static void main( String []args){
        String nome = "Gustavo Daniel";
        int idade = 18;
        String metas = "se toranar um profissional que consiga resolver problemas através da programação";
        float altura = 1.70f;
        double saldo = 123.12;

        System.out.println("Fala, " + nome + "! bom dia! " + "Idade: " + idade + " Altura: " + altura + " Saldo atual: " + saldo + " Sua meta: " + metas);

        if(idade >= 18){
            System.out.println("Tu é maior de idade cara!!");
        } else{
            System.out.println("Eeeee tá novinho em cara!!");
            }

        if (idade % 2 == 0){
            System.out.println("Rapaz... tua idade é um número par, eu aposto");
        } else if (idade % 2 == 1) {
          System.out.println("Sua idade é ímpar!!!");
        }
apag
    }
}
