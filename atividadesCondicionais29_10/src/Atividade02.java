import java.util.Scanner;

public class Atividade02 {
    public void tipoDeNumero(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = read.nextInt();
        String tipo, paridade;

        if(numero < 0){
            tipo = "negativo";
        }else if(numero == 0){
            tipo = "neutro";
        }else{
            tipo = "positivo";
        }
        if(numero%2 == 0){
            paridade = "par";
        }else{
            paridade = "impar";
        }
        System.out.printf("O Número %d é %s e %s",numero,paridade,tipo);
    }
}
