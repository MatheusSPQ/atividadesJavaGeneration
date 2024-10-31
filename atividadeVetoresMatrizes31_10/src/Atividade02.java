import java.util.Arrays;
import java.util.Scanner;

public class Atividade02 {
    public void vector() {
        Scanner read = new Scanner(System.in);
        int[] vector = new int[10];
        int[] oddIndex = new int[5];
        int oddCounter = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um valor para por no vetor: ");
            vector[i] = read.nextInt();
            if(i%2 != 0){
                oddIndex[oddCounter] = vector[i];
                oddCounter++;
            }

        }
        int[] evens = Arrays.stream(vector).filter(e -> e % 2 == 0).toArray(); // para cada elemento e do vector que for par, ou seja divisivel por 2m retorna o elemento e.
        int sum = Arrays.stream(vector).sum();
        float mean = (float) sum /10;
        System.out.println("Elementos nos índices ímpares");
        System.out.println(Arrays.toString(oddIndex));
        System.out.println("Elementos pares: ");
        System.out.println(Arrays.toString(evens));
        System.out.println("Soma: "+ sum);
        System.out.printf("Media: %.2f", mean);
    }
}
