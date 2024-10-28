import java.util.Scanner;

public class Atividade03SalarioLiquido {
    public void salarioLiquido(){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o sálario bruto: ");
        float salarioBruto = read.nextFloat();
        System.out.println("Adicional noturno: ");
        float adicionalNoturno = read.nextFloat();
        System.out.println("Horas extras: ");
        float horasExtras = read.nextFloat();
        System.out.println("Descontos: ");
        float descontos = read.nextFloat();
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
        System.out.printf("Salário Liquido: %.2f\n", salarioLiquido);

    }
}
