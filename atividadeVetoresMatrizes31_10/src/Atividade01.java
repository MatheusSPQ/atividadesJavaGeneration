import java.util.Scanner;

public class Atividade01 {
    public void posicao(){
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[10];
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um valor para por no vetor: ");
            vetor[i] = read.nextInt();
        }
        System.out.println("Digite o número que você deseja encrontrar: ");
        int numeroDesejado = read.nextInt();
        int indice = 0;
        boolean numeroEncontrado = false;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == numeroDesejado){
                numeroEncontrado = true;
                indice = i;
                break;
            }
        }
        if(numeroEncontrado){
            System.out.printf("O número %d está localizado na posição: %d",numeroDesejado,indice);
        }else{
            System.out.printf("O número %d não foi encontrado!",numeroDesejado);
        }

    }
}
