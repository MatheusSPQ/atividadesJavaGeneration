import java.util.Scanner;
import java.util.Stack;

public class Atividade02 {
    public void books(){
        Scanner read = new Scanner(System.in);
        Stack<String> books = new Stack<>();
        boolean menu = true;
        while(menu){
            System.out.println("******************************************************************");
            System.out.println("\n 1 - Adicionar Livro na Pilha");
            System.out.println("\n 2 - Listar todos os Livros");
            System.out.println("\n 3 - Retirar Livro da Pilha");
            System.out.println("\n 0 - Sair \n");
            System.out.println("******************************************************************");
            System.out.println("Entre com a opção desejada:");
            byte option = Byte.parseByte(read.nextLine());
            switch(option){
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    String bookName = read.nextLine();
                    books.push(bookName);
                    System.out.println("Pilha:");
                    System.out.println(books);
                    System.out.println("Livro Adicionado!");
                    System.out.println("Enter qualquer tecla para voltar ao menu");
                    read.nextLine();
                    break;
                case 2:
                    System.out.println("Lista de Livros na pilha:");
                    if (books.isEmpty()){
                        System.out.println("Pilha esta vazia!");
                    }else{
                        System.out.println(books);
                    }
                    System.out.println("Enter qualquer tecla para voltar ao menu");
                    read.nextLine();
                    break;
                case 3:
                    if(books.isEmpty()){
                        System.out.println("Pilha esta vazia!");
                    }else{
                        System.out.printf("O Cliente %s foi removido\n", books.pop());
                        if(books.isEmpty()){
                            System.out.println("Pilha esta vazia!");
                        }else{
                            System.out.println("Pilha:");
                            System.out.println(books);
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
