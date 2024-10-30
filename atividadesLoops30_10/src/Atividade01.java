import java.util.Scanner;

public class Atividade01 {
    public void multiplos(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o primeiro número do intervalo: ");
        int numero1 = read.nextInt();
        System.out.println("Digite o último número do intervalo: ");
        int numero2 = read.nextInt();
        if(numero2 < numero1){
            System.out.println("intervalo invalido!");
        }else{
            for(int i = numero1; i <= numero2; i++){
                if(i %3 == 0 && i %5 == 0){
                    System.out.printf("%d é multiplo de 3 e 5\n",i);
                }
            }
        }

        read.close();

    }
}
