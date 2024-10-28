import java.util.Scanner;

public class Atividade02Media {
    public void media(){
        Scanner read = new Scanner(System.in);
        float nota1, nota2, nota3,nota4;
        System.out.println("Digite uma nota: ");
        nota1 = read.nextFloat();
        System.out.println("Digite uma nota: ");
        nota2 = read.nextFloat();
        System.out.println("Digite uma nota: ");
        nota3 = read.nextFloat();
        System.out.println("Digite uma nota: ");
        nota4 = read.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Média: %.2f\n", media);
    }
}
