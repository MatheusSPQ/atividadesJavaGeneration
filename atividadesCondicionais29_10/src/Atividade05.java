import java.util.Scanner;

public class Atividade05 {
    public void produtos(){
        Scanner read = new Scanner(System.in);
        System.out.println("Código do produto: ");
        int codigoProduto = read.nextInt();
        System.out.println("Quantidade do produto: ");
        int quantidadeProduto = read.nextInt();
        float valorTotal = 0;
        switch(codigoProduto){
            case 1:
                System.out.println("Produto: Cachorro Quente");
                valorTotal = quantidadeProduto*10;
                break;
                case 2:
                    System.out.println("Produto: X-Salada");
                    valorTotal = quantidadeProduto*15;
                    break;
                    case 3:
                        System.out.println("Produto: X-Bacon");
                        valorTotal = quantidadeProduto*18;
                        break;
                        case 4:
                            System.out.println("Produto: Bauru");
                            valorTotal = quantidadeProduto*12;
                            break;
                            case 5:
                                System.out.println("Produto: Refrigerante");
                                valorTotal = quantidadeProduto*8;
                                break;
                                case 6:
                                    System.out.println("Produto: Suco de laranja");
                                    valorTotal = quantidadeProduto*13;
                                    break;
        }
        System.out.printf("Valor Total: R$%.2f",valorTotal);

    }
}
