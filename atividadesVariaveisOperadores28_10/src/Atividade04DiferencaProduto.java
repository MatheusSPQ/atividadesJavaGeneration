import java.util.Scanner;

public class Atividade04DiferencaProduto {
    public void diferencaProdutos(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o numero1: ");
        float numero1 = read.nextFloat();
        System.out.println("Digite o numero2: ");
        float numero2 = read.nextFloat();
        System.out.println("Digite o numero3: ");
        float numero3 = read.nextFloat();
        System.out.println("Digite o numero4: ");
        float numero4 = read.nextFloat();
        float diferenca = (numero1*numero2) - (numero3*numero4);
        System.out.println("Diferenca: " + diferenca);
    }
}
