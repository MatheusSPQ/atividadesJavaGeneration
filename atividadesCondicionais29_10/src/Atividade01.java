import java.util.Scanner;

public class Atividade01 {
    public void somaABmaior(){
        Scanner read = new Scanner(System.in);
        int a, b,c, soma;
        System.out.println("Digite o número A: ");
        a = read.nextInt();
        System.out.println("Digite o numero B: ");
        b = read.nextInt();
        System.out.println("Digite o numero C: ");
        c = read.nextInt();
        soma = a + b;
        if(a+b>c){
            System.out.printf("%d + %d = %d >  %d\n",a,b,soma,c);
            System.out.println("A Soma de A + B é Maior do que C");
        }else if(a+b<c){
            System.out.printf("%d + %d = %d <  %d\n",a,b,soma,c);
            System.out.println("A Soma de A + B é Menor do que C");
        }else{
            System.out.printf("%d + %d = %d = %d\n",a,b,soma,c);
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}
