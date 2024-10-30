import java.util.Scanner;

public class Atividade06 {
    public void mediaDeMultiplosDe3(){
        Scanner read = new Scanner(System.in);
        int numero;
        double soma = 0;
        int quantidade =0;
        double media =0;
        do{
            System.out.println("Digite um numero: ");
            numero = read.nextInt();
            if(numero % 3 == 0 && numero != 0){
                quantidade++;
                soma += numero;
            }
        }while(numero!=0);
        media = soma/quantidade;
        System.out.println("A média de todos os números multiplos de 3 é: "+media);
    }
}
