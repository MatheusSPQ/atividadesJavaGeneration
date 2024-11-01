import java.util.HashSet;
import java.util.Scanner;

public class Atividade04 {
    public void numbersListFound(){
        Scanner read = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0;i<10;i++){
            System.out.println("Digite um número: ");
            numbers.add(read.nextInt());
        }

        System.out.println("Digite o número que deseja encontrar: ");
        int numberRequired = read.nextInt();
        if(numbers.contains(numberRequired)){
            System.out.printf("O número %d foi encontrado!", numberRequired);
        }else{
            System.out.printf("O número %d não foi encontrado!", numberRequired);
        }


    }
}
