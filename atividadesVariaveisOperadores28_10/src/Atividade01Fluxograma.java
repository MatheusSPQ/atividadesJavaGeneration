import java.util.Scanner;

public class Atividade01Fluxograma {
    public void novoSalario(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o salário:");
        float salario = read.nextFloat();
        System.out.println("Digite o Abono:");
        float abono = read.nextFloat();
        float novoSalario = salario+abono;
        System.out.printf("Novo salário: %.2f\n",novoSalario);
    }

}
