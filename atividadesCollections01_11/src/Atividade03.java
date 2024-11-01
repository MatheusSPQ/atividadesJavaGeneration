import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade03 {
    public void numbersList(){
        Scanner read = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0;i<10;i++){
            System.out.println("Digite um número: ");
            numbers.add(read.nextInt());
        }
        Iterator<Integer> iterator = numbers.iterator();

        System.out.println("Listar dados do Set");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
