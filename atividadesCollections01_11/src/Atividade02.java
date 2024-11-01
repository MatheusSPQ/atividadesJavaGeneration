import java.util.ArrayList;
import java.util.Scanner;

public class Atividade02 {
    public void foundNumber(){
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            numbersList.add(read.nextInt());
        }
        System.out.println("\nDigite um número que você deseja encontrar: ");
        int numberRequired = read.nextInt();
        if (numbersList.contains(numberRequired)){
            System.out.printf("O número %d está localizado na posição: %d\n", numberRequired, numbersList.indexOf(numberRequired));
        }else{
            System.out.printf("O número %d não foi encontrado!\n", numberRequired);
        }

    }
}
