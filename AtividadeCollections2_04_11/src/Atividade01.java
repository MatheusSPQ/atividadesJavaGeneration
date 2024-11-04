import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01 {
    public void bankQueue(){
        Queue<String> queue = new LinkedList<>();
        Scanner read = new Scanner(System.in);
        boolean menu = true;
        while(menu){
            System.out.println("******************************************************************");
            System.out.println("\n 1 - Adicionar Cliente na Fila");
            System.out.println("\n 2 - Listar todos os Clientes");
            System.out.println("\n 3 - Retirar Cliente da Fila");
            System.out.println("\n 0 - Sair \n");
            System.out.println("******************************************************************");
            System.out.println("Entre com a opção desejada:");
            byte option = Byte.parseByte(read.nextLine());
            switch(option){
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String clientName = read.nextLine();
                    queue.add(clientName);
                    System.out.println("Fila:");
                    System.out.println(queue);
                    System.out.println("Cliente Adicionado!");
                    System.out.println("Enter qualquer tecla para voltar ao menu");
                    read.nextLine();
                    break;
                    case 2:
                        System.out.println("Lista de Clientes na Fila:");
                        if (queue.isEmpty()){
                            System.out.println("Fila esta vazia!");
                        }else{
                            System.out.println(queue);
                        }
                        System.out.println("Enter qualquer tecla para voltar ao menu");
                        read.nextLine();
                        break;
                        case 3:
                            if(queue.isEmpty()){
                                System.out.println("Fila esta vazia!");
                            }else{
                                System.out.printf("O Cliente %s foi removido\n", queue.poll());
                                if(queue.isEmpty()){
                                    System.out.println("Fila esta vazia!");
                                }else{
                                    System.out.println("Fila:");
                                    System.out.println(queue);
                                }
                            }
                            System.out.println("Enter qualquer tecla para voltar ao menu");
                            read.nextLine();
                            break;
                            case 0:
                                menu = false;
                                System.out.println("Programa finalizado!");
                                break;
            }

        }


    }
}
