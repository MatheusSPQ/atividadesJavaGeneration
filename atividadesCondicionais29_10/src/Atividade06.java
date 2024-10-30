import java.util.Scanner;

public class Atividade06 {
    public void salarioReajustado(){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o nome do colaborador: ");
        String nome = read.nextLine();
        System.out.print("Digite o cargo do colaborador: ");
        int cargo = read.nextInt();
        System.out.print("Digite o salario do colaborador: ");
        float salario = read.nextFloat();
        System.out.println("Nome do colaborador: " + nome);
        switch (cargo){
            case 1:
                System.out.println("Cargo: Gerente");
                System.out.println("Salário: "+salario*1.1);
                break;
                case 2:
                    System.out.println("Cargo: Vendendor");
                    System.out.println("Salário: "+salario*1.07);
                    break;
                    case 3:
                        System.out.println("Cargo: Supervisor");
                        System.out.println("Salário: "+salario*1.09);
                        break;
                        case 4:
                            System.out.println("Cargo: Motorista");
                            System.out.println("Salário: "+salario*1.06);
                            break;
                            case 5:
                                System.out.println("Cargo: Estoquista");
                                System.out.println("Salário: "+salario*1.05);
                                break;
                                case 6:
                                    System.out.println("Cargo: Técnico de TI");
                                    System.out.println("Salário: "+salario*1.08);
                                    break;
        }


    }
}
