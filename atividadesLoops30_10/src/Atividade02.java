import java.util.Scanner;

public class Atividade02 {
    public void paridade(){
        Scanner read2 = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int numero;
        for(int i=1;i<=10;i++){
            System.out.printf("Digite o %dº número:\n",i);
            numero = read2.nextInt();
            if(numero%2 ==0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Total de números pares: "+pares);
        System.out.println("Total de números impares: "+impares);

        read2.close();

    }
}
