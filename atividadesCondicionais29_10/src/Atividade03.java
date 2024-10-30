import java.util.Scanner;

public class Atividade03 {
    public void doarSangue(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o Nome do doador: ");
        String nomeDoador = read.nextLine();
        System.out.println("Digite o Idade: ");
        int idade = read.nextInt();
        System.out.println("Primeira doação de sangue?(true/false): ");
        boolean primeiraDoacao = read.nextBoolean();
        if(idade <= 59 && 18 <= idade || (!primeiraDoacao && idade >=60 && idade <= 69) ){
            System.out.printf("%s está apto para doar sangue",nomeDoador);
        }else{
            System.out.printf("%s não está apto para doar sangue",nomeDoador);
        }
    }
}
