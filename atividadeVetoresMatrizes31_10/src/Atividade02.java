import java.util.Arrays;
import java.util.Scanner;

public class Atividade02 {
    public void vetor() {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] indiceImpares = new int[5];
        int contadorImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para por no vetor: ");
            vetor[i] = read.nextInt();
            if(i%2 != 0){
                indiceImpares[contadorImpar] = vetor[i];
                contadorImpar++;
            }

        }
        int[] pares = Arrays.stream(vetor).filter(e -> e % 2 == 0).toArray(); // para cada elemento e do vetor que for par, ou seja divisivel por 2m retorna o elemento e.
        int soma = Arrays.stream(vetor).sum();
        float media = (float) soma /10;
        System.out.println("Elementos nos índices ímpares");
        System.out.println(Arrays.toString(indiceImpares));
        System.out.println("Elementos pares: ");
        System.out.println(Arrays.toString(pares));
        System.out.println("Soma: "+ soma);
        System.out.printf("Media: %.2f", media);
    }
}
