import java.util.Scanner;

public class Atividade01 {
    public void position(){
        Scanner read = new Scanner(System.in);
        int[] vector = new int[10];
        for(int i = 0; i < vector.length; i++){
            System.out.print("Digite um valor para por no vetor: ");
            vector[i] = read.nextInt();
        }
        System.out.println("Digite o número que você deseja encrontrar: ");
        int diseredNumber = read.nextInt();
        int index = 0;
        boolean foundNumber = false;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] == diseredNumber){
                foundNumber = true;
                index = i;
                break;
            }
        }
        if(foundNumber){
            System.out.printf("O número %d está localizado na posição: %d", diseredNumber, index);
        }else{
            System.out.printf("O número %d não foi encontrado!", diseredNumber);
        }

    }
}
